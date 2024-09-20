package springbootboard.board.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Board {
	
	@Id
	@GeneratedValue
	private Long seq;
	
	private String title;
	
	@Column(updatable=false)
	private String writer;
	
	private String content;
	
	@Column(insertable=false, updatable=false, columnDefinition="date default sysdate")
	private Date createDate;
	
	@Column(insertable=false, columnDefinition="number default 0")
	private Long cnt;
	
	public Board() {
	}
	
	public Board(String writer, String title, String content) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

}










