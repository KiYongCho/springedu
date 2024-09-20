package springbootboard.exception.contoller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootboard.exception.BoardNotFoundException;

@Controller
public class ExceptionController {
	
	@RequestMapping("/exception/boardException")
	public String boardException() {
		throw new BoardNotFoundException("검색된 게시글이 없습니다!");
	}
	
	@RequestMapping("/exception/illegalArgumentException")
	public String illegalArgumentException() {
		throw new IllegalArgumentException("인자가 적절하지 않습니다!");
	}
	
	@RequestMapping("/exception/sqlException")
	public String sqlException() throws SQLException {
		throw new SQLException("SQL구문이 적절지 않습니다!");
	}

} // class

















