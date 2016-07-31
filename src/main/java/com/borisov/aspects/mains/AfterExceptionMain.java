package com.borisov.aspects.mains;

import com.borisov.aspects.configs.AfterExceptionJavaConfig;
import com.borisov.aspects.exception.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vlados on 7/31/2016.
 */
public class AfterExceptionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AfterExceptionJavaConfig.class);
        PersonService bean = ctx.getBean(PersonService.class);
        try {
            bean.getPerson();
        } catch (RuntimeException e) {

        }
    }
}
