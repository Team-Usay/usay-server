package usay.app.domain.room.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usay.app.domain.ApiResponse;
import usay.app.domain.room.service.RoomService;

@Tag(name = "채팅방", description = "채팅방 관련 API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

	private final RoomService roomService;

	@Operation(summary = "신규 채팅방 생성", description = "대화 첫 시작을 위해 채팅방을 생성하고 방 번호를 반환합니다.")
	@GetMapping
	public ApiResponse<Long> createRoom() {
		return ApiResponse.success(roomService.createRoom());
	}
}
