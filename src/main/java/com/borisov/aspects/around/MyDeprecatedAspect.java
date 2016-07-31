package com.borisov.aspects.around;

import com.borisov.annotations.MyDeprecated;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by vlados on 7/31/2016.
 */
@Component
@Aspect
public class MyDeprecatedAspect {
    @Pointcut("execution((@com.borisov.annotations.MyDeprecated *) com.borisov.aspects.around.*.*(..))")
    public void returnObjectAnnotatedMyDeprecated() {}

    @Around("returnObjectAnnotatedMyDeprecated()")
    public Object replaceObject(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = pjp.getSignature().getName();
        System.out.println("Entering into: " + methodName);
        try {
            Object retVal = pjp.proceed();
            MyDeprecated annotation = retVal.getClass().getAnnotation(MyDeprecated.class);
            Object newRetVal = annotation.newClass().newInstance();

            return newRetVal;
        }  finally {
            System.out.println("Existing from: " + methodName);
        }
    }
}
