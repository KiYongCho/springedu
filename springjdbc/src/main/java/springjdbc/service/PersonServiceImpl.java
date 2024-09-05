package springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springjdbc.dao.PersonDao;
import springjdbc.domain.Person;

@Component
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> getPersonList() {
		return personDao.getPersonList();
	}

	@Override
	public Person getPerson(int pid) {
		return personDao.getPerson(pid);
	}

	@Override
	public int insertPerson(Person person) {
		return personDao.insertPerson(person);
	}

	@Override
	public int updatePerson(Person person) {
		return personDao.updatePerson(person);
	}

	@Override
	public int deletePerson(int pid) {
		return personDao.deletePerson(pid);
	}

}
