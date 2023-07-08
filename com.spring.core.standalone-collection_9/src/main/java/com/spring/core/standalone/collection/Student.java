package com.spring.core.standalone.collection;

import java.util.List;
import java.util.Map;

public class Student 
{
	private List friends;
	private Map<String, Integer> courses;

	public List getFriends() 
	{
		return friends;
	}

	public void setFriends(List friends) 
	{
		this.friends = friends;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [friends=" + friends + ", courses=" + courses + "]";
	}
}
