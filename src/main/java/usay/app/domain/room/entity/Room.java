package usay.app.domain.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import usay.app.common.entity.BaseEntity;
import usay.app.domain.agent.entity.Agent;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Room extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	@Column
	private String name;

	@Column
	@Enumerated(EnumType.STRING)
	private RoomStatus status;

	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Agent agent;

	@Builder
	public Room(String name, RoomStatus status, Agent agent) {
		this.name = name;
		this.status = status;
		this.agent = agent;
	}
}