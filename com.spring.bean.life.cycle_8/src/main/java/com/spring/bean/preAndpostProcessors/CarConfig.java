package com.spring.bean.preAndpostProcessors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring.bean.preAndpostProcessors")
public class CarConfig
{
    @Bean(initMethod = "inIt")
    public Car getCar()
    {
        Car c1 = new Car();
        return c1;
    }
}
