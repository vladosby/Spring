package com.borisov.aspects.around;

import com.borisov.annotations.MyDeprecated;

/**
 * Created by vlados on 7/31/2016.
 */

@MyDeprecated(newClass = RobotV2Impl.class)
public class RobotImpl {

    public void say() {
        System.out.println("I am robot");
    }
}
