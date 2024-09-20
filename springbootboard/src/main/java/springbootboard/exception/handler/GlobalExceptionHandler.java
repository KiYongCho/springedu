package springbootboard.exception.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import springbootboard.exception.BoardException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BoardException.class)
	public String handleBoardException(BoardException exception, Model model) {
		model.addAttribute("exception", exception);
		return "/exception/boardException";
	}
	
	@ExceptionHandler(Exception.class)
	public String handleGlobalException(Exception exception, Model model) {
		model.addAttribute("exception", exception);
		return "/exception/globalException";
	}

} // class

















