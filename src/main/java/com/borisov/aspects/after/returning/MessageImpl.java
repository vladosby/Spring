package com.borisov.aspects.after.returning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by vlados on 7/30/2016.
 */

@Component
public class MessageImpl implements Message {
    private String message;

    @Autowired
    public void setMessage(@Value("I am class Message") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
