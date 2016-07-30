package com.borisov;

import org.springframework.context.annotation.*;

/**
 * Created by uladzislau on 7/25/16.
 */

@Configuration
@ComponentScan({"com.borisov.quoters", "com.borisov.bpp", "com.borisov.bfpp, com.borisov.aspects.talk"})
@PropertySource("classpath:quotes.properties")
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public String string() {
        return "trust me";
    }
}
