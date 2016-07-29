package com.borisov.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.lang.reflect.Method;

/**
 * Created by uladzislau on 7/27/16.
 */

@Component
public class PreDestroyWarningInPrototypeBFPP implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            boolean destroyPresentInPrototype = false;
                try {
                    if(beanDefinition.getBeanClassName() != null) {
                        Class<?> aClass = Class.forName(beanDefinition.getBeanClassName());
                        Method[] methods = aClass.getMethods();
                        for(Method method: methods) {
                            if(method.isAnnotationPresent(PreDestroy.class)) {
                                destroyPresentInPrototype = true;
                            }
                        }

                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            if(beanDefinition.isPrototype() && (beanDefinition.getInitMethodName() != null || destroyPresentInPrototype)) {
                System.out.printf("You use @PreDestroy annotation in class %s that never will work", beanDefinition.getBeanClassName());
            }
        }
    }
}
