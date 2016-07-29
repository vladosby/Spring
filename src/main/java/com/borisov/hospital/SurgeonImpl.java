package com.borisov.hospital;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uladzislau on 7/29/16.
 */
public class SurgeonImpl implements Surgeon {
    @Autowired
    private Assistant assistant;

    @Override
    public void operate() {
        System.out.println("Alcohol");
        assistant.getAlcohol().drink();

        System.out.println("Scalpel");
        assistant.getScalpel().cut();

        System.out.println("Alcohol");
        assistant.getAlcohol().drink();

        System.out.println("Alcohol");
        assistant.getAlcohol().drink();

        System.out.println("Salt Cucumber");
        SaltCucumber saltCucumber = assistant.getSaltCucumber();

        if(saltCucumber.isChewed()) {
            System.out.println("You gave me cucumber that was chewed");
        } else {
            saltCucumber.chew();
            System.out.println("Good going");
        }


    }
}
