package springjdbc.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import springjdbc.domain.Person;
import springjdbc.service.PersonService;
import springjdbc.service.PersonServiceImpl;

@Component
public class PersonMain {

	private static PersonService personService;
	
	private static ApplicationContext context
		= new ClassPathXmlApplicationContext("/springjdbc/conf/applicationContext.xml");
	
	public static void main(String[] args) {
		
		personService = context.getBean(PersonServiceImpl.class);
		
		// insertPerson
		//personService.insertPerson(new Person(0, "홍길동", 20));
		//personService.insertPerson(new Person(0, "강감찬", 30));
		
		// getPersonList
		//System.out.println(personService.getPersonList());
		
		// getPerson
		//System.out.println(personService.getPerson(1));
		
		// updatePerson
		//personService.updatePerson(new Person(1, "이순신", 50));
		
		// deletePerson
		//personService.deletePerson(2);
		
	}

} // class











