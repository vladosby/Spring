package com.borisov.conditions;

import com.borisov.annotations.ConditionMode;

/**
 * Created by uladzislau on 7/28/16.
 */

@org.springframework.stereotype.Repository
@ConditionMode(false)
public class DerbyRepository implements Repository {
    @Override
    public void print() {
        System.out.println("Derby");
    }
}
