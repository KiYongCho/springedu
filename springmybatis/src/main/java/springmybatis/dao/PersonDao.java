package springmybatis.dao;

import java.util.List;

import springmybatis.domain.Person;

public interface PersonDao {
	
	public abstract List<Person> getPersonList();
	
	public abstract Person getPerson(int pid);
	
	public abstract int insertPerson(Person person);
	
	public abstract int updatePerson(Person person);
	
	public abstract int deletePerson(int pid);	

}
