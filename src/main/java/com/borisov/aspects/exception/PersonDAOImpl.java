package com.borisov.aspects.exception;

import org.springframework.stereotype.Repository;

/**
 * Created by vlados on 7/31/2016.
 */

@Repository
public class PersonDAOImpl implements PersonDAO {
    @Override
    public Person getPerson() {
        throw new DatabaseRuntimeException();
//        return null;
    }
}
