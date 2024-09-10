package springbootbasic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import springbootbasic.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPerson() {
		Person person = new Person();
		person.setName("홍길동"); 
		person.setAge(20);
		return person;
	}

	@Override
	public List<Person> getPersonList() {
		Person person1 = new Person();
		person1.setName("홍길동");
		person1.setAge(20);		
		Person person2 = new Person();
		person2.setName("이순신");
		person2.setAge(30);		
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		
		return personList;
	}

}
