package com.borisov.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by uladzislau on 7/28/16.
 */
public class DocumentMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("com.borisov.injection.bean.into.map");
    }
}
