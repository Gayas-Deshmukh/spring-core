package com.spring.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{

    public static void main(String[] args)
    {
        Resource resource   =   new ClassPathResource("com.spring.autowire.xml");
        BeanFactory factory =   new XmlBeanFactory(resource);
        
        Student student = factory.getBean(Student.class);
        
        System.out.println(student);
    }

}
