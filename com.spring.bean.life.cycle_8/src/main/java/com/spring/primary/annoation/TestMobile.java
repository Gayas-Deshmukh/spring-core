package com.spring.primary.annoation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMobile
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);
        
      //  Mobile mobile   =   context.getBean(Mobile.class);
        
      //  mobile.getdetails();
        
        Electronics elect   =   context.getBean(Electronics.class);
        
        elect.save();
        elect.getMobile().getdetails();
    }
}
