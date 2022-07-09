package com.spring.bean.life.cycle.using.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMobile
{

    public static void main(String[] args)
    {
        ApplicationContext context =    new AnnotationConfigApplicationContext(MobileConfig.class);
        
        Mobile mobile =   context.getBean(Mobile.class);
        
        System.out.println(mobile);
        
        ((ConfigurableApplicationContext)context).close();

    }
}
