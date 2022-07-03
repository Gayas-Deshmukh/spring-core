package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student
{
    private int studentId;
    private String studentName;
    
    @Autowired
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
