package com.borisov.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by uladzislau on 7/27/16.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDeprecated {
    Class newClass();
}
