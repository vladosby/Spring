package com.borisov.mains;

import com.borisov.javaconfigs.DBJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by uladzislau on 7/28/16.
 */
public class DBMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(DBJavaConfig.class);
    }
}
