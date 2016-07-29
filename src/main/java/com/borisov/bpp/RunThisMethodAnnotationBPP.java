package com.borisov.bpp;

import com.borisov.annotations.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by uladzislau on 7/26/16.
 */
@Component
public class RunThisMethodAnnotationBPP implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null) {
                try {
                    for (int i = 0; i < annotation.repeat(); i++) {
                        method.invoke(o);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
