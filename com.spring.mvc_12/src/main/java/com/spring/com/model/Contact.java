package com.spring.com.model;

import java.util.Date;
import java.util.List;

public class Contact 
{
	private String name;
	private int id;
	private Date dob;
	private String type;
	private List<String> courses;
	private String gender;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", id=" + id + ", dob=" + dob + ", type=" + type + ", courses=" + courses
				+ ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
}
