package usay.app.domain.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.domain.room.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {}
