package Topic6;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendee")
public class AttendeeRestController {

	private final AttendeeRepository attendeeRepository;

	@Autowired
	AttendeeRestController(AttendeeRepository attendeeRepository) {
		this.attendeeRepository = attendeeRepository;

	}

	@RequestMapping(method = RequestMethod.GET)
	ArrayList<String> attendeesList() {
		ArrayList<String> list = new ArrayList<String>();
		for (Attendee attendee : attendeeRepository.findAll()) {
			list.add(attendee.toString());

		}

		return list;
	}
}