package com.borisov.aspects.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by vlados on 7/30/2016.
 */

@Configuration
@ComponentScan({"com.borisov.aspects.after.returning"})
@PropertySource("classpath:quotes.properties")
@EnableAspectJAutoProxy
public class AfterReturnJavaConfig {
}
