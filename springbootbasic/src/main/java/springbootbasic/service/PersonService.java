package springbootbasic.service;
import java.util.List;

import springbootbasic.domain.Person;

public interface PersonService {
	
	public abstract Person getPerson();
	
	public abstract List<Person> getPersonList();

}
