package usay.app.domain.chat.service;

import static usay.app.domain.chat.entity.dto.ChatResponseDTO.GetChatResponse;
import static usay.app.domain.chat.entity.dto.ChatResponseDTO.PostChatResponse;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import usay.app.domain.chat.entity.Chat;
import usay.app.domain.chat.entity.dto.ChatRequestDTO.PostChatRequest;
import usay.app.domain.chat.repository.ChatRepository;
import usay.app.domain.member.entity.Member;
import usay.app.domain.member.repository.MemberRepository;
import usay.app.domain.member.service.MemberService;
import usay.app.domain.room.entity.Room;
import usay.app.domain.room.repository.RoomRepository;
import usay.app.domain.room.service.RoomService;

@Service
@RequiredArgsConstructor
public class ChatService {
	private final ChatRepository chatRepository;
	private final MemberService memberService;
	private final RoomService roomService;
	private final MemberRepository memberRepository;
	private final RoomRepository roomRepository;

	@Transactional(readOnly = true)
	public List<GetChatResponse> getChatList(Long roomId) {
		List<Chat> chats = chatRepository.findByRoomIdOrderByCreatedAtDesc(roomId);

		return chats.stream()
				.map(GetChatResponse::from)
				.collect(Collectors.toList());
	}

	@Transactional
	public PostChatResponse postChat(PostChatRequest postChatRequest) {
		Member member = memberService.getMemberById(postChatRequest.getMemberId());
		Room room = roomService.getRoomById(postChatRequest.getRoomId());
		Chat chat = chatRepository.save(postChatRequest.of(member, room, postChatRequest.getContent()));
		return PostChatResponse.from(chat);
	}

	public List<GetChatResponse> getChatListByMemberId(Long memberId) {
		List<Chat> chats = chatRepository.findByMemberIdOrderByCreatedAtDesc(memberId);

		return chats.stream()
				.map(GetChatResponse::from)
				.collect(Collectors.toList());
	}
}
