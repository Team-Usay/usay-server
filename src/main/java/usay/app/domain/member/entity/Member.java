package usay.app.domain.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usay.app.common.entity.BaseEntity;
import usay.app.domain.chat.entity.Chat;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private Long id;

	private String name;

	private String nickname;

	private Integer score;

	@OneToMany(mappedBy = "member", orphanRemoval = true)
	private List<Chat> chats;

	@Builder
	public Member(String name, String nickname, Integer score) {
		this.name = name;
		this.nickname = nickname;
		this.score = score;
	}
}