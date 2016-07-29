package com.borisov.annotations;

import com.borisov.conditions.ModeCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by uladzislau on 7/28/16.
 */

@Retention(RetentionPolicy.RUNTIME)
@Conditional(ModeCondition.class)
public @interface ConditionMode {
    boolean value();
}
