package com.borisov.injection.bean.into.map;

import org.springframework.stereotype.Component;

/**
 * Created by uladzislau on 7/28/16.
 */

@Component("2")
public class SecondDocument implements Document {
    @Override
    public void printDocument() {
        System.out.println("Second document");
    }
}
