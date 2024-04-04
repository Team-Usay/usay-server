package usay.app.common;

import org.springframework.data.jpa.repository.JpaRepository;
import usay.app.common.domain.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {}
