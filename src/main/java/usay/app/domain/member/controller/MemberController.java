package usay.app.domain.member.controller;

import static usay.app.domain.member.dto.MemberResponseDTO.MemberDetail;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usay.app.domain.ApiResponse;
import usay.app.domain.member.service.MemberService;

@Tag(name = "회원", description = "회원 관련 API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
	private final MemberService memberService;

	@Operation(summary = "회원 정보 조회", description = "해당 회원의 정보를 조회할 수 있습니다.")
	@GetMapping("/{memberId}")
	public ApiResponse<MemberDetail> getMember(@PathVariable Long memberId) {
		return ApiResponse.success(memberService.getMemberDetail(memberId));
	}
}
