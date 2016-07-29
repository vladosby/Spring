package com.borisov.injection.bean.into.map;

import org.springframework.stereotype.Component;

/**
 * Created by uladzislau on 7/28/16.
 */

@Component("1")
public class FirtstDocument implements Document {
    @Override
    public void printDocument() {
        System.out.println("First document");
    }
}
