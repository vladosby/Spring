package com.borisov.quantifiers;

import com.borisov.annotations.DB;
import com.borisov.annotations.DBType;
import com.borisov.annotations.Oracle;

/**
 * Created by uladzislau on 7/28/16.
 */

//@Oracle
@DB(DBType.ORACLE)
public class OracleDAO implements DAO {
    @Override
    public void crud() {
        System.out.println("I am oracle DAO");
    }
}
