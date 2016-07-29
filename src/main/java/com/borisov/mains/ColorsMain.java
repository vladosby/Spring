package com.borisov.mains;

import com.borisov.javaconfigs.ColorsJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by uladzislau on 7/27/16.
 */
public class ColorsMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ColorsJavaConfig.class);
    }
}
