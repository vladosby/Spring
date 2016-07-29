package com.borisov.conditions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by uladzislau on 7/28/16.
 */

@Service
public class ServiceIntImpl implements ServiceInt {
    @Autowired
    private Repository repository;

    @PostConstruct
    @Override
    public void print() {
        repository.print();
    }
}
