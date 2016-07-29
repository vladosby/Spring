package com.borisov.reflection;

import com.borisov.annotations.RunThisMethod;

/**
 * Created by uladzislau on 7/25/16.
 */
public class TestObject {

    @RunThisMethod(repeat = 5)
    public void print() {
        System.out.println("Hello");
    }

    public void doNotPrint() {
        System.out.println("I don't have to print");
    }

    @RunThisMethod
    public void print2() {
        System.out.println("Hello2");
    }
}
