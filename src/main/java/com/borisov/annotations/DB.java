package com.borisov.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by uladzislau on 7/28/16.
 */


@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Repository
@Autowired
public @interface DB {
    DBType value();
}
