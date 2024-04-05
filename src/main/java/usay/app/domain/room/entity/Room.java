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
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usay.app.common.entity.BaseEntity;
import usay.app.domain.agent.entity.Agent;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity

public class Room extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(nullable = false)
	private String name;

	@Column
	@Enumerated(EnumType.STRING)
	private RoomStatus status;

	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Agent agent;

	public Room(String name, RoomStatus status, Agent agent) {
		this.name = name;
		this.status = status;
		this.agent = agent;
	}
}