package com.borisov.aspects.around;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by vlados on 7/31/2016.
 */

@Service
public class RobotCallerImpl implements RobotCaller {
    @Autowired
    private RobotReturner robotReturner;

    @PostConstruct
    @Override
    public void call() {
        RobotImpl robot = robotReturner.getRobot();
        robot.say();
    }
}
