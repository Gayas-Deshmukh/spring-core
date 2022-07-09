package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student
{
    private int studentId;
    private String studentName;
    
    /*
     *  if we have multiple beans of same type & for Autowire if we request for such beans then we will get an exception
     *  so to get specific bean for autowire or any other purpose we can use  '@Qualifier' annotation where we can define requested bean name
     */
    @Autowired
  //  @Qualifier(value = "studentAddress2")  // we can use this annotation at class level as well
    private Address studentAddress;
    
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public Address getStudentAddress()
    {
        return studentAddress;
    }
    
    //@Autowired
    public void setStudentAddress(Address studentAddress)
    {
        this.studentAddress = studentAddress;
        System.out.println("Setting Student Address th'r setter method");
    }
    
    //@Autowired
    public Student(Address studentAddress)
    {
        super();
        this.studentAddress = studentAddress;
        System.out.println("Student Constructor called ...");
    }
    
    public Student()
    {
        super();
    }
    
    @Override
    public String toString()
    {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
    }
   
}
