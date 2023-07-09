package com.spring.core.value.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config-value-annotation.xml");
		
		Student student	= context.getBean(Student.class);
		
		System.out.println(student); //Student [Name=Gayas, city=Nashik, friends=[Gayas, Raju, Nitin, Amol], sqaureRoot=5.0, pi=3.141592653589793, lastName=Deshmukh]

	}
}
