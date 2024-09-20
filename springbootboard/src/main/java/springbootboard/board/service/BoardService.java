package springbootboard.board.service;

import java.util.List;

import springbootboard.board.entity.Board;

public interface BoardService {
	
	public abstract List<Board> listBoard();
	
	public abstract Board getBoard(Board board, String action);
	
	public abstract void insertBoard(Board board);
	
	public abstract void updateBoard(Board board);
	
	public abstract void deleteBoard(Board board);

}
