package com.borisov.aspects.talk;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by vlados on 7/30/2016.
 */

@Component
@Aspect
public class TalkAspect {
    @Pointcut("execution(* com.borisov.quoters..*.talk(..))")
    public void talkPointcut() {}

    @Before("execution(* com.borisov.quoters..*.talk(..))")
    public void beforeTalkMethod() {
        System.out.println("Aspect work before method talk");
    }

    @After("talkPointcut()")
    public void beforeTalkMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("method name: " + methodName);
    }
}
