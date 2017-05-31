package Topic6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Meeting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long meetingId;

	@OneToOne
	private Attendee attendee;

	@OneToOne
	private Room room;

	private String timeSlot;

	public Meeting() {
	}

	public Meeting(Attendee attendee, Room room, String timeSlot) {
		this.attendee = attendee;
		this.room = room;
		this.timeSlot = timeSlot;
	}

	public long getMeetingId() {
		return meetingId;
	}

	public void setMeetingID(long meetingId) {
		this.meetingId = meetingId;
	}

	public Attendee getAttendee() {
		return attendee;
	}

	public void setAttendee(Attendee attendee) {
		this.attendee = attendee;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", attendee=" + attendee + ", room=" + room + ", timeSlot="
				+ timeSlot + "]";
	}

}