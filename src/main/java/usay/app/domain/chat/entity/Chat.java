package usay.app.domain.chat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usay.app.common.entity.BaseEntity;
import usay.app.domain.member.entity.Member;
import usay.app.domain.room.entity.Room;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Chat extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chat_id")
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String content;

	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;

	@Builder
	public Chat(String content, Member member, Room room) {
		this.content = content;
		this.member = member;
		this.room = room;
	}
}