package com.spring.autowire;

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
    public void setStudentAddress(Address studentAddress)
    {
        this.studentAddress = studentAddress;
    }
      
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
