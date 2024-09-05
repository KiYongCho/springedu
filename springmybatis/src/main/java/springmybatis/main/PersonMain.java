package springmybatis.main;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import springmybatis.domain.Person;
import springmybatis.service.PersonService;
import springmybatis.service.PersonServiceImpl;

@Component
public class PersonMain {

	private static PersonService personService;
	
	private static ApplicationContext context
		= new ClassPathXmlApplicationContext("/springmybatis/conf/applicationContext.xml");
	
	public static void main(String[] args) {
		
		personService = context.getBean(PersonServiceImpl.class);
		
		// insertPerson
		//personService.insertPerson(new Person(0, "홍길동", 20));
		//personService.insertPerson(new Person(0, "강감찬", 30));
		
		// getPersonList
		//System.out.println(personService.getPersonList());
		
		// getPerson
		//System.out.println(personService.getPerson(3));
		
		// updatePerson
		//personService.updatePerson(new Person(3, "권율", 60));
		
		// deletePerson
		//personService.deletePerson(3);
		
	}

} // class











