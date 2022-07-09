package com.spring.bean.life.cycle.using.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.bean.life.cycle.using.bean_annotation.Mobile")
public class MobileConfig
{
    @Bean(initMethod = "start", destroyMethod = "destroy")
    public Mobile getMobile()
    {
        Mobile mobile   = new Mobile();
        
        mobile.setMobileName("Lenovo");
        
        return mobile;
    }
}
