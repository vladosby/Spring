package com.borisov.quantifiers;

import com.borisov.annotations.DB;
import com.borisov.annotations.DBType;
import com.borisov.annotations.Derby;

/**
 * Created by uladzislau on 7/28/16.
 */

//@Derby
@DB(DBType.DERBY)
public class DerbyDAO implements DAO {
    @Override
    public void crud() {
        System.out.println("I am Derby DAO");
    }
}
