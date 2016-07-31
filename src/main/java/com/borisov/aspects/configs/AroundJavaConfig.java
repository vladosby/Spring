package com.borisov.aspects.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by vlados on 7/31/2016.
 */

@Configuration
@ComponentScan({"com.borisov.aspects.around"})
@EnableAspectJAutoProxy
public class AroundJavaConfig {
}
