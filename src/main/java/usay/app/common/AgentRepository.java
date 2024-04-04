package usay.app.common;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.common.domain.Agent;


public interface AgentRepository extends JpaRepository<Agent, Long> {
}
