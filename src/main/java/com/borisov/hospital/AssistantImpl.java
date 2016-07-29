package com.borisov.hospital;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uladzislau on 7/29/16.
 */
public abstract class AssistantImpl implements Assistant {
    @Autowired
    private Alcohol alcohol;

    @Autowired
    private Scalpel scalpel;

    @Override
    public Alcohol getAlcohol() {
        return alcohol;
    }

    @Override
    public Scalpel getScalpel() {
        return scalpel;
    }

    @Override
    public abstract SaltCucumber getSaltCucumber();
}
