package com.borisov.listeners;


import com.borisov.annotations.PostInitialized;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * Created by vlados on 8/1/2016.
 */

@Component
public class PostInitializedListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Collection<Object> values = contextRefreshedEvent.getApplicationContext().getBeansOfType(Object.class).values();
        values.forEach(bean -> {
            Method[] methods = bean.getClass().getMethods();
            for (Method method : methods) {
                if(method.isAnnotationPresent(PostInitialized.class)) {
                    try {
                        method.invoke(bean);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
