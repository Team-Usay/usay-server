package usay.app.domain.chat.controller;

import static usay.app.domain.chat.entity.dto.ChatResponseDTO.PostChatResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usay.app.domain.ApiResponse;
import usay.app.domain.chat.entity.dto.ChatRecords;
import usay.app.domain.chat.entity.dto.ChatRequestDTO.ModelAnswerRequest;
import usay.app.domain.chat.entity.dto.ChatRequestDTO.PostChatRequest;
import usay.app.domain.chat.entity.dto.ChatResponseDTO.ModelAnswerResponse;
import usay.app.domain.chat.service.ChatService;

@Tag(name = "답변", description = "사용자 답변 관련 API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/chats")
public class ChatController {
	private final ChatService chatService;

	@Operation(summary = "대화방 별 전체 채팅 조회", description = "해당 채팅방 내 모든 대화 기록을 조회합니다.")
	@GetMapping("/{roomId}")
	public ApiResponse<ChatRecords> getChatList(@PathVariable Long roomId) {
		return ApiResponse.success(chatService.getChatList(roomId));
	}

	@Operation(summary = "사용자의 전체 채팅 조회", description = "해당 사용자의 답변을 조회합니다.")
	@GetMapping("/{memberId}")
	public ApiResponse<ChatRecords> getChatListByMemberId(@PathVariable Long memberId) {
		return ApiResponse.success(chatService.getChatListByMemberId(memberId));
	}

	@Operation(summary = "채팅방 채팅 등록", description = "해당 채팅방에 채팅을 등록합니다.")
	@PostMapping("/{memberId}")
	public ApiResponse<PostChatResponse> postChat(
			@PathVariable Long memberId,
			@RequestBody PostChatRequest postChatRequest) {
		return ApiResponse.success(chatService.postChat(postChatRequest));
	}

	@Operation(summary = "시작 질문 조회", description = "챗봇 서버에서 초기 질문을 조회합니다.")
	@GetMapping("/init")
	public ApiResponse<ModelAnswerResponse> getInitialMessage() {
		return ApiResponse.success(chatService.getInitialMessage());
	}

	@Operation(summary = "답변 조회", description = "사용자의 질문에 대한 답변을 조회합니다.")
	@PostMapping("/ask")
	public ApiResponse<ModelAnswerResponse> getAnswer(@RequestBody ModelAnswerRequest request) {
		return ApiResponse.success(chatService.getAnswer(request));
	}
}