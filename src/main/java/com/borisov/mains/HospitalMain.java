package com.borisov.mains;

import com.borisov.hospital.Surgeon;
import com.borisov.javaconfigs.HospitalJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by uladzislau on 7/29/16.
 */
public class HospitalMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HospitalJavaConfig.class);
        Surgeon surgeonOne = (Surgeon) ctx.getBean("surgeonOne");
        Surgeon surgeonTwo = (Surgeon) ctx.getBean("surgeonTwo");
        surgeonOne.operate();
        System.out.println("***************************");
        surgeonTwo.operate();

    }
}
