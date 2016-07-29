package com.borisov.quoters;

import com.borisov.annotations.Benchmark;
import com.borisov.annotations.Transaction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by uladzislau on 7/25/16.
 */

@Service
public class ShakespeareQuoter implements Quoter{
//    @Value("I am shakespeare")
//    @Autowired
    @Value("${shakespeareQuote}")
    private String quote;

//    @PostConstruct
    @Override
    @Benchmark
    @Transaction
//    @RunThisMethod(repeat = 3)
    public void sayQuote() {
        System.out.println(quote);
    }
}
