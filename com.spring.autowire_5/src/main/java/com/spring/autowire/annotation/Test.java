package com.spring.autowire.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{

    public static void main(String[] args)
    {
        ApplicationContext context  =   new ClassPathXmlApplicationContext("com.spring.autowire.annotation.xml");
        
        Student student = context.getBean(Student.class);
        
        System.out.println(student);
    }

}
