package com.spring.bean.life.cycle.using.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMobile
{

    public static void main(String[] args)
    {
        ApplicationContext context =    new ClassPathXmlApplicationContext("config.xml");
        
        Mobile mobile =   context.getBean(Mobile.class);
        
        System.out.println(mobile);
        
        ((ConfigurableApplicationContext)context).close();

    }
}
