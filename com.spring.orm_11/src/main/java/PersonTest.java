import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.dao.PersonDao;
import com.spring.entity.Person;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		 ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		 
		 PersonDao personDao = context.getBean(PersonDao.class);
		 
		 // Insert
		 /*
		 Person person = new Person();
		 person.setName("Rajesh");
		 person.setCity("Nashik");
		 
		 int addPerson = personDao.addPerson(person);
		 
		 System.out.println(addPerson + " Persons inserted");
		 */
		 /******************************/
		 
		 //Update
		 /*
		 Person person = new Person();
		 person.setId(1);
		 person.setName("Rajesh");
		 person.setCity("Nashik Updated");
		 
		 personDao.updatePerson(person);
		 
		 System.out.println(" Persons Updated");
		 */
		 /******************************/
		 
		 // Delete
		 
		 personDao.deletePerson(2);
		 
		 System.out.println(" Persons Deleted");
		 
		 /******************************/
		 
		 // Select
		 /*
		 Person personById = personDao.getPersonById(1);
		 
		 System.out.println(personById);
		 
		 List<Person> allPersons = personDao.getAllPersons();
		 
		 allPersons.forEach(p -> System.out.println(p));
		 */
	}
}
