package springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import springjdbc.domain.Person;

@Component
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Person> getPersonList() {
		String sql = " select * from person order by pid desc ";
		return jdbcTemplate.query(sql, new RowMapper<Person>() {
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person person = new Person();
				person.setPid(rs.getInt("pid"));
				person.setPname(rs.getString("pname"));
				person.setPage(rs.getInt("page"));
				return person;
			}
		});
	} 
	
	public Person getPerson(int pid) {
		String sql = " select * from person where pid=? ";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Person>() {
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person person = new Person();
				person.setPid(rs.getInt("pid"));
				person.setPname(rs.getString("pname"));
				person.setPage(rs.getInt("page"));
				return person;
			}
		}, pid);
	}
	
	public int insertPerson(Person person) {
		String sql = " insert into person values(seq_person.nextval, ?, ?) ";
		return jdbcTemplate.update(sql, person.getPname(), person.getPage());
	}
	
	public int updatePerson(Person person) {
		String sql = " update person set pname=?, page=? where pid=? ";
		return jdbcTemplate.update(sql, person.getPname(), person.getPage(), person.getPid());
	}
	
	public int deletePerson(int pid) {
		String sql = " delete person where pid=? ";
		return jdbcTemplate.update(sql, pid);
	}

}
