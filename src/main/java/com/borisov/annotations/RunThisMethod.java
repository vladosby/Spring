package com.borisov.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by uladzislau on 7/25/16.
 */


@Retention(RetentionPolicy.RUNTIME)
public @interface RunThisMethod {
    int repeat() default 1;
}
