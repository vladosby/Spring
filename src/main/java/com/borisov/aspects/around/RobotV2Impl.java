package com.borisov.aspects.around;

/**
 * Created by vlados on 7/31/2016.
 */

public class RobotV2Impl extends RobotImpl {
    @Override
    public void say() {
        System.out.println("I am new robot. I am version 2!!!!");
    }
}
