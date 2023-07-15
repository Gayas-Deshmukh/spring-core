package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.entity.Student;

public class RowMapperImp implements RowMapper<Student>
{
	/*
	 * An interface used by JdbcTemplate for mapping rows of a java.sql.ResultSet on a per-row basis. 
	 * Implementations of this interface perform the actual work of mapping each row to a result object
	 */

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Student student = new Student();
		
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}

}
