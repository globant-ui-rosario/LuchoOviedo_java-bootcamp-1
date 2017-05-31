package Topic6;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomRestController {
	private final RoomRepository roomRepository;

	@Autowired
	RoomRestController(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	ArrayList<String> roomList() {
		ArrayList<String> list = new ArrayList<String>();
		for (Room room : roomRepository.findAll()) {
			list.add(room.toString());
		}
		return list;
	}

}