package com.borisov.bpp;

import com.borisov.annotations.Benchmark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by uladzislau on 7/26/16.
 */

@Component
public class BenchmarkAnnotationBPP implements BeanPostProcessor {
    @Autowired
    private ConfigurableListableBeanFactory factory;


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        BeanDefinition beanDefinition = factory.getBeanDefinition(s);
        String beanClassName = beanDefinition.getBeanClassName();
        Class<?> aClass = null;
        if (beanClassName != null) {
            try {
                aClass = Class.forName(beanClassName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        boolean benchmarkFound = false;
        if (aClass != null) {
            Method[] methods = aClass.getMethods();
            for (Method m : methods) {
                if (m.isAnnotationPresent(Benchmark.class)) {
                    benchmarkFound = true;
                    break;
                }
            }
        }

        if (benchmarkFound) {
            final Class<?> clazz = aClass;
            //In handler method will come from interface, we cannot see any annotations that is in class
            Object o1 = Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), (proxy, method, args) -> {
                Method originalMethod = clazz.getMethod(method.getName(), method.getParameterTypes());

                if (originalMethod.isAnnotationPresent(Benchmark.class)) {
//                if(method.isAnnotationPresent(Benchmark.class)) { //doesn't work
                    //In handler method will come from interface, we cannot see any annotations that is in class

                    long before = System.nanoTime();
                    Object retVal = method.invoke(o, args);
                    long after = System.nanoTime();
                    System.out.println("time of work = " + (after - before));
                    return retVal;
                } else {
                    Object retVal = method.invoke(o, args);
                    return retVal;
                }
            });

            return o1;
        } else {
            return o;
        }
    }
}
