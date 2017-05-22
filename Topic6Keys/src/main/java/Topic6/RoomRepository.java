package Topic6;

import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
	Room findByRoomId(long roomId);

}