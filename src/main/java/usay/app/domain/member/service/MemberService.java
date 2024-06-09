package usay.app.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import usay.app.domain.ErrorCode;
import usay.app.domain.member.dto.MemberResponseDTO.MemberDetail;
import usay.app.domain.member.entity.Member;
import usay.app.domain.member.repository.MemberRepository;
import usay.app.global.exception.NotFoundException;

@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional(readOnly = true)
	public Member getMemberById(Long memberId) {
		return memberRepository.findById(memberId)
				.orElseThrow(() -> new NotFoundException(ErrorCode.MEMBER_NOT_FOUND));
	}

	@Transactional(readOnly = true)
	public MemberDetail getMemberDetail(Long memberId) {
		return memberRepository.findById(memberId)
				.map(MemberDetail::from)
				.orElseThrow(() -> new NotFoundException(ErrorCode.MEMBER_NOT_FOUND));
	}
}
