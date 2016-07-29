package com.borisov.hospital;

/**
 * Created by uladzislau on 7/29/16.
 */
public class SaltCucumberImpl implements SaltCucumber {
    private boolean chewed;

    @Override
    public boolean isChewed() {
        return chewed;
    }

    @Override
    public void chew() {
        chewed = true;
    }
}
