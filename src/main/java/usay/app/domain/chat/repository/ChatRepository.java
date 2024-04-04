package usay.app.domain.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.common.domain.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long> {}
