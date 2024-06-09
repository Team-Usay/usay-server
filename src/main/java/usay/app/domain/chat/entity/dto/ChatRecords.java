package usay.app.domain.chat.entity.dto;

import java.util.ArrayList;
import java.util.List;
import usay.app.domain.chat.entity.dto.ChatResponseDTO.ChatRecordResponse;

public class ChatRecords {
	private final List<ChatRecordResponse> chatRecords;

	public ChatRecords(List<ChatRecordResponse> chatRecords) {
		this.chatRecords = List.copyOf(chatRecords);
	}

	public int size() {
		return chatRecords.size();
	}

	public ChatRecordResponse get(int index) {
		return chatRecords.get(index);
	}

	public List<ChatRecordResponse> asList() {
		return new ArrayList<>(chatRecords);
	}
}