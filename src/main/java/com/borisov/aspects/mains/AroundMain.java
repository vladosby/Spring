package com.borisov.aspects.mains;

import com.borisov.aspects.configs.AroundJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vlados on 7/31/2016.
 */
public class AroundMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AroundJavaConfig.class);
    }
}
