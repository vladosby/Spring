package com.borisov.javaconfigs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by uladzislau on 7/29/16.
 */

@Configuration
@ComponentScan({"com.borisov.bean.dependencies"})
@PropertySource("classpath:quotes.properties")
public class DependendBeanJavaConfig {
}
