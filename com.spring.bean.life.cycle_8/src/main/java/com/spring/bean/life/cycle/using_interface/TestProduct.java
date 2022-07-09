package com.spring.bean.life.cycle.using_interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct
{

    public static void main(String[] args)
    {
        ApplicationContext context =    new ClassPathXmlApplicationContext("config.xml");
        
        Product product =   context.getBean(Product.class);
        
        System.out.println(product);
        
        ((ConfigurableApplicationContext)context).close();

    }

}
