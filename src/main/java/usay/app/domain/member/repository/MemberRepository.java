package usay.app.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.domain.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {}
