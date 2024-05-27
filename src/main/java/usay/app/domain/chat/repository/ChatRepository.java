package usay.app.domain.chat.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.domain.chat.entity.Chat;
import usay.app.domain.chat.entity.dto.ChatRequestDTO.PostChatRequest;

public interface ChatRepository extends JpaRepository<Chat, Long> {
	Chat getChatById(Long id);

	List<Chat> findByRoomIdOrderByCreatedAtDesc(Long roomId);

	Chat save(PostChatRequest postChatRequest);

	List<Chat> findByMemberIdOrderByCreatedAtDesc(Long memberId);
}
