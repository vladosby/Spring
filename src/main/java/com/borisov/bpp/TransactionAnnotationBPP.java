package com.borisov.bpp;

import com.borisov.annotations.Benchmark;
import com.borisov.annotations.Transaction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by uladzislau on 7/27/16.
 */

@Component
public class TransactionAnnotationBPP implements BeanPostProcessor {
    Map<String, Class> classes = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Method[] methods = o.getClass().getMethods();
        for(Method method: methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                classes.put(s, o.getClass());
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        Class<?> aClass = classes.get(s);
        if (aClass != null) {

            //In handler method will come from interface, we cannot see any annotations that is in class
            return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), (proxy, method, args) -> {
                Method originalMethod = aClass.getMethod(method.getName(), method.getParameterTypes());

                if(originalMethod.isAnnotationPresent(Transaction.class)) {
//                if(method.isAnnotationPresent(Benchmark.class)) { //doesn't work
                    //In handler method will come from interface, we cannot see any annotations that is in class

                    System.out.println("start transaction");
                    Object retVal = method.invoke(o, args);
                    System.out.println("finish transaction");
                    return retVal;
                } else {
                    return method.invoke(o, args);
                }
            });
        } else {
            return o;
        }
    }
}
