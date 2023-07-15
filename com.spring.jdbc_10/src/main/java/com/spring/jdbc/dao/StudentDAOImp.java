package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entity.Student;

public class StudentDAOImp implements StudentaDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) 
	{
		String query = "insert into student (id, name, city) values(?,?,?)";
		
		return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
	}

	public int update(Student student) 
	{
		String query = "update student set name=?, city=? where id=?";
		
		return jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
	}

	public int delete(Student student) 
	{
		String query = "delete from student where id=?";
		
		return jdbcTemplate.update(query, student.getId());
	}
	
	public Student getStudentById(int id) 
	{
		String	query = "select * from student where id=?";
		
		return this.jdbcTemplate.queryForObject(query, new RowMapperImp(), id);
	}

	public List<Student> getAllStudents() 
	{
		String	query = "select * from student";
		
		return this.jdbcTemplate.query(query, new RowMapperImp());
	}

	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
}
