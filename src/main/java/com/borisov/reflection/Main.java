package com.borisov.reflection;

/**
 * Created by uladzislau on 7/25/16.
 */
public class Main {
    public static void main(String[] args) {
        Object object = ObjectFactory.createObject(TestObject.class);
        System.out.println(object);
    }
}
