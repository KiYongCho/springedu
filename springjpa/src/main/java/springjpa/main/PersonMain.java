package springjpa.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springjpa.domain.Person;
import springjpa.service.PersonService;

public class PersonMain {
	
	private PersonService personService;
	private ApplicationContext context 
		= new GenericXmlApplicationContext("classpath:/springjpa/conf/applicationContext.xml");
	
	public static void main(String[] args) {
		
		PersonMain personMain = new PersonMain();
		
		personMain.personService 
			= (PersonService)personMain.context.getBean("personService", PersonService.class);

		try {
			
			// insertPerson
			//Person person = new Person(0, "홍길동", 20, new Date());
			//personMain.personService.insertPerson(person);
			
			// getPersonList
			//System.out.println(personMain.personService.getPersonList());
			
			// getPerson
			//System.out.println(personMain.personService.getPerson(1));
			
			// updatePerson
			//Person person = new Person(1, "권율", 50, new Date());
			//personMain.personService.updatePerson(person);
			
			// deletePerson
			//personMain.personService.deletePerson(1);			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

} // class


















