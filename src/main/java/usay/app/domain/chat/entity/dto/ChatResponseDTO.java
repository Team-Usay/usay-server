package usay.app.domain.chat.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usay.app.domain.chat.entity.Chat;

public class ChatResponseDTO {
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class GetChatResponse {
		private Long id;
		private Long memberId;
		private Long roomId;
		private String content;

		public static GetChatResponse from(Chat chat) {
			return GetChatResponse.builder()
					.id(chat.getId())
					.memberId(chat.getMember().getId())
					.roomId(chat.getRoom().getId())
					.content(chat.getContent())
					.build();
		}
	}

	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class PostChatResponse {
		private Long id;
		private Long memberId;
		private Long roomId;
		private String content;

		public static PostChatResponse from(Chat chat) {
			return PostChatResponse.builder()
					.id(chat.getId())
					.memberId(chat.getMember().getId())
					.roomId(chat.getRoom().getId())
					.content(chat.getContent())
					.build();
		}
	}
}
