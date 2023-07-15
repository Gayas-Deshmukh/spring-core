package com.spring.dao;

import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.entity.Person;

@Service
public interface PersonDao 
{
	 int addPerson(Person person);
	 void updatePerson(Person person);
	 void deletePerson(int id);
	 Person getPersonById(int id);
	 List<Person> getAllPersons();
}
