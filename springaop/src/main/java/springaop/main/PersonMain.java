package springaop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springaop.service.PersonService;

public class PersonMain {
	
	private ApplicationContext context;
	private PersonService personService;
	
	public PersonMain() {
		context = new GenericXmlApplicationContext("classpath:/springaop/conf/applicationContext.xml");
	}
	
	public static void main(String[] args) {
		
		PersonMain personMain = new PersonMain();
		
		personMain.personService = (PersonService)personMain.context.getBean("personService");
		
		personMain.personService.printPerson();
		
		System.out.println("-------------------------------------");
		
		// 실습)
		// LogAspect에 Pointcut과 After/Before Advice를 생성해서
		// getPerson() 호출시 앞뒤로 출력
		personMain.personService.getPerson();
		
	}

} // class


















