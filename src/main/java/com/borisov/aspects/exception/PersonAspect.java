package com.borisov.aspects.exception;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by vlados on 7/31/2016.
 */

@Component
@Aspect
public class PersonAspect {
    @Value("${emails}")
    private String[] emails;

    private Map<DatabaseRuntimeException, Integer> map = new WeakHashMap<>();

    @Pointcut("execution(* com.borisov.aspects.exception.*.getPerson(..))")
    public void afterException() {
    }

    @AfterThrowing(pointcut = "afterException()", throwing = "e")
    public void logException(JoinPoint jp, DatabaseRuntimeException e) {
        if(!map.containsKey(e)) {
            map.put(e, 1);
            System.out.println("Sending email for: " + Arrays.toString(emails));
            System.out.println();
            System.out.println(e.getClass().getName());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
