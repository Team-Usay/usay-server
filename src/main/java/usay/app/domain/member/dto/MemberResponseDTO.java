package usay.app.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usay.app.domain.member.entity.Member;

public class MemberResponseDTO {

	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class MemberDetail {
		private Long id;
		private String name;
		private String nickname;
		private Integer score;

		public static MemberDetail from(Member member) {
			return MemberDetail.builder()
					.id(member.getId())
					.name(member.getName())
					.nickname(member.getNickname())
					.score(member.getScore())
					.build();
		}
	}
}
