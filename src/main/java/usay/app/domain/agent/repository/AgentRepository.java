package usay.app.domain.agent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.domain.agent.entity.Agent;


public interface AgentRepository extends JpaRepository<Agent, Long> {
}
