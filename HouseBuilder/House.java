package HouseBuilder;

public class House {

	private int rooms,doors,windows,floors;

	public House (){
		this.rooms = 0;
		this.doors = 0;
		this.windows = 0;
		this.floors = 0;
	}
	
	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	public String toString() {
		return " Number of rooms: " + rooms + " , number of doors : " + doors + " , number of windows : " + windows + " , number of floors : " + floors ;
	}

	
}
