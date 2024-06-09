package usay.app.domain.room.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import usay.app.domain.ErrorCode;
import usay.app.domain.room.entity.Room;
import usay.app.domain.room.repository.RoomRepository;
import usay.app.global.exception.NotFoundException;

@RequiredArgsConstructor
@Service
public class RoomService {
	private final RoomRepository roomRepository;

	@Transactional
	public Long createRoom() {
		return roomRepository.save(new Room()).getId();
	}

	@Transactional(readOnly = true)
	public Room getRoomById(Long roomId) {
		return roomRepository.findById(roomId)
				.orElseThrow(() -> new NotFoundException(ErrorCode.ROOM_NOT_FOUND));
	}
}
