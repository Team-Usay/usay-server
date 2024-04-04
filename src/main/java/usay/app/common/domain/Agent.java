package usay.app.common.domain;

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
import lombok.NonNull;
import usay.app.common.entity.BaseEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Agent extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String name;

	@NonNull
	private Integer difficulty;

	@NonNull
	@Column(columnDefinition = "TEXT")
	private String about;

	@OneToMany(mappedBy = "agent", orphanRemoval = true)
	private List<Room> rooms;

	@Builder
	public Agent(String name, Integer difficulty, String about) {
		this.name = name;
		this.difficulty = difficulty;
		this.about = about;
	}
}