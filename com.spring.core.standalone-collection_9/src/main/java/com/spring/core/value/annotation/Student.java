package com.spring.core.value.annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	/**
	 * @value annotation is used to assign some default value to the variable
	 */
	
	@Value("Gayas")
	private String Name;
	
	@Value("Nashik")
	private String city;
	
	@Value("#{fds}")
	private List friends;
	
	// Assigning value by calling static method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double sqaureRoot;
	
	// Assigning value by accessing static variable
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	// Assigning object reference variable
	@Value("#{new java.lang.String('Deshmukh')}")
	private String lastName;
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String name)
	{
		Name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public List getFriends()
	{
		return friends;
	}
	
	public void setFriends(List friends)
	{
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", city=" + city + ", friends=" + friends + ", sqaureRoot=" + sqaureRoot
				+ ", pi=" + pi + ", lastName=" + lastName + "]";
	}
	
	
}
