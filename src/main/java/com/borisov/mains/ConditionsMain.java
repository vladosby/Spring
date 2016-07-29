package com.borisov.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by uladzislau on 7/28/16.
 */
public class ConditionsMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("com.borisov.conditions");
    }
}
