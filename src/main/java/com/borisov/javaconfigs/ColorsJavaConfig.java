package com.borisov.javaconfigs;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

/**
 * Created by uladzislau on 7/27/16.
 */

@Configuration
@ComponentScan({"com.borisov.colors"})
public class ColorsJavaConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Color randomColor() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
