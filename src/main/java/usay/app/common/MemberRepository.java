package usay.app.common;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.common.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {}
