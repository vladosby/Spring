package com.borisov.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by uladzislau on 7/26/16.
 */

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TalkingRobotImpl implements TalkingRobot {
//    @Autowired
    List<Quoter> quoters;

    @Autowired
    public TalkingRobotImpl(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @PostConstruct
//    @PreDestroy
    @Override
    public void talk() {
        for (Quoter quoter : quoters) {
            quoter.sayQuote();
        }
    }
}
