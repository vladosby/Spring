package com.borisov.mains;

import com.borisov.javaconfigs.ListenerJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vlados on 8/1/2016.
 */
public class ListenerMain {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ListenerJavaConfig.class);
    }
}
