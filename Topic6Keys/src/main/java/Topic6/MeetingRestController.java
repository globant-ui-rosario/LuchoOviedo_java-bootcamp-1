package Topic6;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meeting")
public class MeetingRestController {
	
	private final MeetingRepository meetingRepository;
	AttendeeRepository attendeeRepository ;
	RoomRepository roomRepository ;

	@Autowired
	MeetingRestController(MeetingRepository meetingRepository,
			AttendeeRepository attendeeRepository ,
	RoomRepository roomRepository ) {
		this.meetingRepository = meetingRepository;
		this.attendeeRepository = attendeeRepository;
		this.roomRepository = roomRepository;
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<String> listMeeting() {
		ArrayList<String> list = new ArrayList<String>();
		for (Meeting meeting : meetingRepository.findAll()) {
			list.add(meeting.toString());
		}
		return list;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ArrayList<String> createMeeting(
		@RequestParam(value="room" , required = true) long room,
		@RequestParam(value="attendee" , required = true) long attendee,
		@RequestParam(value="timeSlot", required = true) String timeSlot
			) {
		
		meetingRepository.save(new Meeting(attendeeRepository.findByAttendeeId(attendee),roomRepository.findByRoomId(room),  timeSlot));
		return listMeeting();

	}
	
	@RequestMapping(value = "/delete/{meetingId}", method = RequestMethod.DELETE)
	public ArrayList<String> deleteMeeting(@PathVariable long meetingId) throws DataFormatException{
		meetingRepository.delete(meetingRepository.findByMeetingId(meetingId));
		return listMeeting();
	}
	
	@RequestMapping(value = "/update/{meetingId}", method = RequestMethod.PUT)
	public void updateMeeting(@PathVariable long meetingId, @RequestBody Meeting meeting) {
		meetingRepository.save(meeting); 
	}
	
	@RequestMapping(value ="/update2/{id}", method = RequestMethod.PUT  )
	 public @ResponseBody
	 void update2Meeting( @PathVariable("id") int id, @RequestBody Meeting meeting) {
	  meetingRepository.save(meeting);
	 }

}