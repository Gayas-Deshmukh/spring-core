package com.spring.bean.preAndpostProcessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar
{
    public static void main(String[] args)
    {
       ApplicationContext context   =   new AnnotationConfigApplicationContext(CarConfig.class);
       
       Car car = context.getBean(Car.class);
       System.out.println(car.hashCode());
       
       
       // Not working as expected
       
    }
}
