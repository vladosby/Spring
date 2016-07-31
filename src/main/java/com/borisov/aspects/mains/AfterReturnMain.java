package com.borisov.aspects.mains;

import com.borisov.aspects.configs.AfterReturnJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vlados on 7/30/2016.
 */
public class AfterReturnMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AfterReturnJavaConfig.class);
    }
}
