package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.Person;

@Service
public class PersonDaoImp implements PersonDao
{
	// To perform write operation on db we have to make use of @Transactional annotation
	// for read operation we do not require it
	// we also need to create a bean of "TransactionManager" for this
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addPerson(Person person)
	{

		Integer id = (Integer) this.hibernateTemplate.save(person);
		
		return id;
	}

	@Transactional
	public void updatePerson(Person person) 
	{
		 this.hibernateTemplate.update(person);
	}

	@Transactional
	public void deletePerson(int id) 
	{
		
		Person person = this.hibernateTemplate.get(Person.class, id);
		
		this.hibernateTemplate.delete(person);
	}

	public Person getPersonById(int id) 
	{
		return this.hibernateTemplate.get(Person.class, id);
	}

	public List<Person> getAllPersons() 
	{
		return this.hibernateTemplate.loadAll(Person.class);
	}
}
