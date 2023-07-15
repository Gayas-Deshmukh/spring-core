package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentaDAO 
{
	public int insert (Student student);
	public int update (Student student);
	public int delete (Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudents();
}
