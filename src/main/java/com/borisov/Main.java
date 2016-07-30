package com.borisov;


import com.borisov.quoters.Quoter;
import com.borisov.quoters.ShakespeareQuoter;
import com.borisov.quoters.TalkingRobot;
import com.borisov.quoters.TerminatorQuoter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Created by uladzislau on 7/25/16.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
//        ShakespeareQuoter shakespeareQuoter = ctx.getBean("shakespeareQuoter", ShakespeareQuoter.class);
//        TerminatorQuoter terminatorQuoter = ctx.getBean("terminatorQuoter", TerminatorQuoter.class);
//        shakespeareQuoter.sayQuote();
//        terminatorQuoter.sayQuote();
//
//        Map<String, Quoter> beansOfType = ctx.getBeansOfType(Quoter.class);
//        beansOfType.values().forEach(Quoter::sayQuote);

                Map<String, TalkingRobot> beansOfType = ctx.getBeansOfType(TalkingRobot.class);
        System.out.println();
        beansOfType.values().forEach(TalkingRobot::talk);
    }

}
