package com.spring.autowire.component.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

    public static void main(String[] args)
    {
        ApplicationContext context  =   new ClassPathXmlApplicationContext("com.spring.autowire.component.scan.xml");
        
        Student student = context.getBean(Student.class);
        
        System.out.println(student);
    }

}
