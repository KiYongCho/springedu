package springbootboard.member.repository;

import org.springframework.data.repository.CrudRepository;

import springbootboard.member.entity.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
