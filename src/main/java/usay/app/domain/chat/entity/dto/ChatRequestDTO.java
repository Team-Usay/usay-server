package usay.app.domain.chat.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usay.app.domain.chat.entity.Chat;
import usay.app.domain.member.entity.Member;
import usay.app.domain.room.entity.Room;

public class ChatRequestDTO {
	@Getter
	public static class GetChatRequest {
		private Long id;
		private Long memberId;
		private Long roomId;
		private String content;

		public Chat of(Member member, Room room) {
			return new Chat(content, member, room);
		}
	}

	@Getter
	public static class PostChatRequest {
		private Long memberId;
		private Long roomId;
		private String content;

		public Chat of(Member member, Room room, String content) {
			return new Chat(content, member, room);
		}
	}

	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class ModelAnswerRequest {
		private String answer;
	}
}
