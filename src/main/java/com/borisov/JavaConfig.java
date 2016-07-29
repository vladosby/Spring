package com.borisov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by uladzislau on 7/25/16.
 */

@Configuration
@ComponentScan({"com.borisov.quoters", "com.borisov.bpp", "com.borisov.bfpp"})
@PropertySource("classpath:quotes.properties")
public class JavaConfig {

    @Bean
    public String string() {
        return "trust me";
    }
}
