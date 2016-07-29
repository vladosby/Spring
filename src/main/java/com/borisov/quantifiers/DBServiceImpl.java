package com.borisov.quantifiers;

import com.borisov.annotations.DB;
import com.borisov.annotations.DBType;
import com.borisov.annotations.Derby;
import com.borisov.annotations.Oracle;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by uladzislau on 7/28/16.
 */

@Service
public class DBServiceImpl implements DBService {

//    @Oracle
//    @Derby
    @DB(DBType.DERBY)
    private DAO dao;

    @Override
    @PostConstruct
    public void crud() {
        System.out.println("Service is working");
        dao.crud();
    }
}
