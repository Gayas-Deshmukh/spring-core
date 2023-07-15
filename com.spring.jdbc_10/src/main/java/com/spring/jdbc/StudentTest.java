package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentaDAO;
import com.spring.jdbc.entity.Student;


public class StudentTest {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		StudentaDAO studentaDAO = context.getBean("studentDao", StudentaDAO.class);
		
		// INSERT 
		/*
		Student student = new Student();
		
		student.setId(2);
		student.setName("Nitin");
		student.setCity("Mumbai");
		
		int insert = studentaDAO.insert(student);
		
		System.out.println( insert + " students inserted");
		*/
		
		// UPDATE
		/*
		Student student = new Student();
		
		student.setId(2);
		student.setName("Rahul Updated");
		student.setCity("Pune Updated");
		
		int update = studentaDAO.update(student);
		
		System.out.println(update + " students updated");
		*/
		
		// DELETE
		/*
		Student student = new Student();
		student.setId(2);
		
		int delete = studentaDAO.delete(student);
		
		System.out.println(delete + " students deleted");
		*/
		
		// SELECT
		/*
		Student student = studentaDAO.getStudentById(3);
		
		System.out.println(student);
		
		List<Student> allStudents = studentaDAO.getAllStudents();
		
		allStudents.forEach(s -> System.out.println(s));
		*/
	}

}
