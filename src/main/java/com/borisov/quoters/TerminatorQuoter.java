package com.borisov.quoters;

import com.borisov.annotations.MyDeprecated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uladzislau on 7/25/16.
 */

@Service
@MyDeprecated(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {

    private List<String> quotes;

//    @PostConstruct
    @Override
    public void sayQuote() {
        for (String quote : quotes) {
            System.out.println(quote);
        }

    }

    public List<String> getQuotes() {
        return quotes;
    }

    @Value(value = "i,ll,be,back")
    public void setQuotes(String[] quotes) {
          this.quotes = Arrays.asList(quotes);
    }
}
