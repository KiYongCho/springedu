package springjpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PERSON")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int pid;
	@Column(name="pname")
	private String pname;
	private int page;
	@Temporal(TemporalType.DATE)
	private Date prdate;
	
	public Person() {
	}

	public Person(int pid, String pname, int page, Date prdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.prdate = prdate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Date getPrdate() {
		return prdate;
	}

	public void setPrdate(Date prdate) {
		this.prdate = prdate;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", prdate=" + prdate + "]";
	}
	
} // class































