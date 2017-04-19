package Building;

public class Build {

	private int rooms;

	private String typeBuilding;
	
	private String streetAdress;

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getTypeBuilding() {
		return typeBuilding;
	}

	public void setTypeBuilding(String typeBuilding) {
		this.typeBuilding = typeBuilding;
	}
	
	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}


	public String toString() {
		return typeBuilding + " , number of rooms: " + rooms + " , adress: " + streetAdress;
	}


}