package com.spring.autowire.component.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    private int studentId;
    private String studentName;
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
    
   // @Autowired
    public void setStudentAddress(Address studentAddress)
    {
        this.studentAddress = studentAddress;
        System.out.println("Setter StudentAddress executing..");
    }
    
    @Autowired
    public Student(Address studentAddress)
    {
        super();
        this.studentAddress = studentAddress;
        System.out.println("Student Constructor called ...");
    }
    
    @Override
    public String toString()
    {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
    }
   
}
