package springmybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmybatis.domain.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	public SqlSessionFactory sqlSessionFactory;
	
	private SqlSession sqlSession;

	public List<Person> getPersonList() {
		return sqlSessionFactory.openSession().selectList("Person.getPersonList");
	} 
	
	public Person getPerson(int pid) {
		return (Person)sqlSessionFactory.openSession().selectOne("Person.getPerson", pid);
	}
	
	public int insertPerson(Person person) {
		return sqlSessionFactory.openSession().insert("Person.insertPerson", person);
	}
	
	public int updatePerson(Person person) {
		return sqlSessionFactory.openSession().update("Person.updatePerson", person);
	}
	
	public int deletePerson(int pid) {
		return sqlSessionFactory.openSession().delete("Person.deletePerson", pid);
	}

}
