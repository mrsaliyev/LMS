package kz.iitu.lms.repository;

import kz.iitu.lms.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsMemberByLoginAndPassword(String login, String password);
    Member getMemberByLogin(String login);
    Member findByLogin(String login);
    List<Member> getMembersBy();
}
