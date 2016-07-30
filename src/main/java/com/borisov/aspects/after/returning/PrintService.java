package com.borisov.aspects.after.returning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by vlados on 7/30/2016.
 */

@Service
public class PrintService {
    @Autowired
    private Message message;

    @PostConstruct
    public void print() {
        System.out.println(message.getMessage());
    }

}
