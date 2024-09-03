package springmvc5.service;

import java.util.List;

import springmvc5.domain.Person;

public interface PersonService {
	
	public abstract List<Person> getPersonList();
	
	public abstract Person getPerson(int pid);
	
	public abstract  List<Person> insertPerson(Person person);
	
	public abstract  List<Person> updatePerson(Person person);
	
	public abstract  void deletePerson(int pid);

}
