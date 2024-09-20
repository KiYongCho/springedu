package springbootboard.board.repository;

import org.springframework.data.repository.CrudRepository;

import springbootboard.board.entity.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
