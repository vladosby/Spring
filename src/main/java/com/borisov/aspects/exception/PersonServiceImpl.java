package com.borisov.aspects.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vlados on 7/31/2016.
 */

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDAO person;

    @Override
    public Person getPerson() {
        return person.getPerson();
    }
}
