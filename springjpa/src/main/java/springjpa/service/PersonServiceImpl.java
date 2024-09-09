package springjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import springjpa.dao.PersonDao;
import springjpa.domain.Person;

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
	@Transactional
	public int insertPerson(Person person) {
		return personDao.insertPerson(person);
	}

	@Override
	@Transactional
	public int updatePerson(Person person) {
		return personDao.updatePerson(person);
	}

	@Override
	@Transactional
	public int deletePerson(int pid) {
		return personDao.deletePerson(pid);
	}

}
