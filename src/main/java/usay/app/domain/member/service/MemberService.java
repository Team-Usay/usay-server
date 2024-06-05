package usay.app.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import usay.app.domain.member.dto.MemberResponseDTO.MemberDetail;

@RequiredArgsConstructor
@Service
public class MemberService {

	@Transactional(readOnly = true)
	public MemberDetail getMemberDetail(Long memberId) {
		return null;
	}
}
