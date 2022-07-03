package com.SpringBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass
{

    public static void main(String[] args)
    {
     /*  Resource resource = new ClassPathResource("config.xml");
       BeanFactory factory = new XmlBeanFactory(resource);
       
       Customer customer    =   factory.getBean(Customer.class);
       
       System.out.println(customer);*/
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Customer customer2 = context.getBean(Customer.class);
        
        System.out.println(customer2);
    }

}
