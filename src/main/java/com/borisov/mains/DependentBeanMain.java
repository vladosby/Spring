package com.borisov.mains;

import com.borisov.javaconfigs.DependendBeanJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by uladzislau on 7/29/16.
 */
public class DependentBeanMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(DependendBeanJavaConfig.class);
    }
}
