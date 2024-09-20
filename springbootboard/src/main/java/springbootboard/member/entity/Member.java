package springbootboard.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {
	
	@Id
	private String id;
	private String password;
	private String name;
	private String role;

}
