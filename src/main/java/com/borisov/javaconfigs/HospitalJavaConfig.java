package com.borisov.javaconfigs;

import com.borisov.hospital.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by uladzislau on 7/29/16.
 */

@Configuration
public class HospitalJavaConfig {
    @Bean
    public Surgeon surgeonOne() {
        return new SurgeonImpl();
    }

    @Bean
    public Surgeon surgeonTwo() {
        return new SurgeonImpl();
    }

    @Bean
    public Assistant assistant() {
        return new AssistantImpl() {
            @Override
            public SaltCucumber getSaltCucumber() {
                return saltCucumber();
            }
        };
    }

    @Bean
    public Scalpel scalpel() {
        return new ScalpelImpl();
    }

    @Bean
    public Alcohol alcohol() {
        return new AlcoholImpl();
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public SaltCucumber saltCucumber() {
        return new SaltCucumberImpl();
    }
}
