package usay.app.domain.chat.service;

import static usay.app.domain.chat.entity.dto.ChatResponseDTO.ChatRecordResponse;
import static usay.app.domain.chat.entity.dto.ChatResponseDTO.PostChatResponse;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import usay.app.domain.chat.entity.Chat;
import usay.app.domain.chat.entity.dto.ChatRecords;
import usay.app.domain.chat.entity.dto.ChatRequestDTO.ModelAnswerRequest;
import usay.app.domain.chat.entity.dto.ChatRequestDTO.PostChatRequest;
import usay.app.domain.chat.entity.dto.ChatResponseDTO.ModelAnswerResponse;
import usay.app.domain.chat.repository.ChatRepository;
import usay.app.domain.member.entity.Member;
import usay.app.domain.member.service.MemberService;
import usay.app.domain.room.entity.Room;
import usay.app.domain.room.service.RoomService;

@Service
@RequiredArgsConstructor
public class ChatService {

	private final ChatRepository chatRepository;
	private final MemberService memberService;
	private final RoomService roomService;
	private final WebClient webClient;

	@Transactional(readOnly = true)
	public ChatRecords getChatList(Long roomId) {
		List<Chat> chats = chatRepository.findByRoomId(roomId);
		List<ChatRecordResponse> chatRecords = chats.stream()
				.map(ChatRecordResponse::from)
				.collect(Collectors.toList());
		return new ChatRecords(chatRecords);
	}

	@Transactional
	public PostChatResponse postChat(PostChatRequest postChatRequest) {
		Member member = memberService.getMemberById(postChatRequest.getMemberId());
		Room room = roomService.getRoomById(postChatRequest.getRoomId());
		Chat chat = chatRepository.save(postChatRequest.of(member, room, postChatRequest.getContent()));
		return PostChatResponse.from(chat);
	}

	@Transactional(readOnly = true)
	public ChatRecords getChatListByMemberId(Long memberId) {
		List<Chat> chats = chatRepository.findByMemberId(memberId);
		List<ChatRecordResponse> chatRecords = chats.stream()
				.map(ChatRecordResponse::from)
				.collect(Collectors.toList());
		return new ChatRecords(chatRecords);
	}

	@Transactional(readOnly = true)
	public ModelAnswerResponse getInitialMessage() {
		String initQuestion = webClient.post()
				.uri("/init")
				.retrieve()
				.bodyToMono(String.class)
				.block();
		return ModelAnswerResponse.from(initQuestion);
	}

	@Transactional
	public ModelAnswerResponse getAnswer(ModelAnswerRequest request) {
		String question = request.getAnswer();
		String answer = webClient.post()
				.uri("/ask")
				.bodyValue(question)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		return ModelAnswerResponse.from(answer);
	}
}
