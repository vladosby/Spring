package com.borisov.bfpp;

import com.borisov.annotations.MyDeprecated;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by uladzislau on 7/27/16.
 */

@Component
public class MyDeprecatedAnnotationBFPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);

            String beanClassName = beanDefinition.getBeanClassName();
            if(beanClassName != null) {
                try {
                    Class<?> aClass = Class.forName(beanClassName);
                    if(aClass != null && aClass.isAnnotationPresent(MyDeprecated.class)) {
                        MyDeprecated annotation = aClass.getAnnotation(MyDeprecated.class);
                        Class aClass1 = annotation.newClass();
                        beanDefinition.setBeanClass(aClass1);
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
