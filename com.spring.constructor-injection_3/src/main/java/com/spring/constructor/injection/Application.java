package com.spring.constructor.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application {

	public static void main(String[] args) 
	{
	    Resource      resource        =   new ClassPathResource("constructor-injection.xml");
        BeanFactory   factory         =   new XmlBeanFactory(resource);
        
        Passport      passportInfo    =   factory.getBean(Passport.class);
        
        System.out.println("----------------------------------------------");
        System.out.println(passportInfo);
	}

}
