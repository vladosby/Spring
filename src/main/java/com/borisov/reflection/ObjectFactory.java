package com.borisov.reflection;

import com.borisov.annotations.RunThisMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by uladzislau on 7/25/16.
 */
public class ObjectFactory {
    public static <T> T createObject(Class<T> clazz) {
        T object = null;
        try {
            object = clazz.newInstance();

            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.isAnnotationPresent(RunThisMethod.class)) {
                    RunThisMethod declaredAnnotation = method.getDeclaredAnnotation(RunThisMethod.class);
                    int repeat = declaredAnnotation.repeat();

                    for (int i = 0; i < repeat; i++) {
                        method.invoke(object);
                    }
                }
            }

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return object;
    }
}
