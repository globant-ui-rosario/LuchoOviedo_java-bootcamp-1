package Topic6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roomId;
	private String roomLocation;

	public Room() {

	}

	public Room(String roomLocation) {
		this.roomLocation = roomLocation;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomLocation=" + roomLocation + "]";
	}

}
