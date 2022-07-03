package com.spring.setter;

import java.util.Properties;
import java.util.Set;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application 
{
	public static void main(String[] args) 
	{
		Resource      resource        =   new ClassPathResource("config.xml");
		BeanFactory   factory         =   new XmlBeanFactory(resource);
		
		Passport      passportInfo    =   factory.getBean(Passport.class);
		
		System.out.println("----------------------------------------------");
		System.out.println(passportInfo);
		
		System.out.println("----------------------------------------------");
		System.out.println("County List :" + passportInfo.getCountryList());
		
		System.out.println("----------------------------------------------");
        System.out.println("Country Code :" + passportInfo.getCountryCode());
        
        System.out.println("----------------------------------------------");
        Set additionalInfo = passportInfo.getAdditionalInfo().entrySet();
        System.out.println("Additional Info :" + additionalInfo);
        
        System.out.println("----------------------------------------------");
        Set fightinfo = passportInfo.getFightInfo().entrySet();
        System.out.println("Flight Info :" + fightinfo);
        
        System.out.println("----------------------------------------------");
        Cutomer customer    =   passportInfo.getCustomer();
        System.out.println("Customer Id :" + customer.getCustomerId());
        System.out.println("Customer Name :" + customer.getCustomerName());
        System.out.println("Customer City :" + customer.getCity());

        
		
	}

}
