package springbootboard.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import springbootboard.board.entity.Board;
import springbootboard.board.service.BoardService;
import springbootboard.member.entity.Member;

@Controller
@SessionAttributes("member")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	// Member객체가 필요할때 Member객체를 주입해 주는 setter
	@ModelAttribute("member")
	public Member setMember() {
		return new Member();
	}
	
	@RequestMapping("/board/listBoard")
	public String listBoard(@ModelAttribute("member") Member member, Model model) {
		if (member.getId()==null) {
			return "redirect:/member/login";
		}
		List<Board> boardList = boardService.listBoard();
		model.addAttribute("boardList", boardList);
		return "/board/listBoard";
	}
	
	@GetMapping("/board/insertBoard")
	public String insertBoard(@ModelAttribute("member") Member member) {
		if(member.getId()==null) {
			return "redirect:/member/login";
		}
		return "/board/insertBoard";
	}
	
	@PostMapping("/board/insertBoardProc")
	public String insertBoardProc(@ModelAttribute("member") Member member, Board board) {
		if(member.getId()==null) {
			return "redirect:/member/login";
		}
		boardService.insertBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/board/getBoard")
	public String getBoard(@ModelAttribute("member") Member member, Board board, 
			Model model, String action) {
		if(member.getId()==null) {
			return "redirect:/member/login";
		}
		model.addAttribute("board", boardService.getBoard(board, action));
		return "/board/getBoard";
	}
	
	@PostMapping("/board/updateBoardProc")
	public String updateBoardProc(@ModelAttribute("member") Member member, Board board) {
		if(member.getId()==null) {
			return "redirect:/member/login";
		}
		boardService.updateBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/board/deleteBoard")
	public String deleteBoard(@ModelAttribute("member") Member member, Board board) {
		if(member.getId()==null) {
			return "redirect:/member/login";
		}
		boardService.deleteBoard(board);
		return "redirect:/board/listBoard";
	}
	
} // class


















