package springjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import springjpa.domain.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Person> getPersonList() {
		String jpql = " FROM Person ORDER BY pid DESC ";
		return em.createQuery(jpql).getResultList();
	}

	@Override
	public Person getPerson(int pid) {
		return em.find(Person.class, pid);
	}

	@Override
	public int insertPerson(Person person) {
		em.persist(person);
		return 1;
	}

	@Override
	public int updatePerson(Person person) {
		em.merge(person);
		return 1;
	}

	@Override
	public int deletePerson(int pid) {
		em.remove(getPerson(pid));
		return 1;
	}

} // class






