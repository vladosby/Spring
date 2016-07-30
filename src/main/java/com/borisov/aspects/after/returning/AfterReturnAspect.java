package com.borisov.aspects.after.returning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by vlados on 7/30/2016.
 */

@Component
@Aspect
public class AfterReturnAspect {
    @Pointcut("execution(* com.borisov.aspects.after.returning..*.getMessage(..))")
    public void getMessagePointcut() {}

    @AfterReturning(pointcut = "getMessagePointcut()", returning = "retVal")
    public void afterReturn(String retVal) {
        System.out.println("getMessage returned next message: " + retVal);
    }
}
