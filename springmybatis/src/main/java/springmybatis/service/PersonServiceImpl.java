package springmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmybatis.dao.PersonDao;
import springmybatis.domain.Person;

@Service
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
