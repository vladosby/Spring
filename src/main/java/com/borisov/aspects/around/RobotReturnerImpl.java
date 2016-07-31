package com.borisov.aspects.around;

import org.springframework.stereotype.Component;

/**
 * Created by vlados on 7/31/2016.
 */

@Component
public class RobotReturnerImpl implements RobotReturner {

    @Override
    public RobotImpl getRobot() {
        return new RobotImpl();
    }
}
