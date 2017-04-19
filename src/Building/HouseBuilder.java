package Building;

public class HouseBuilder implements Builder {

	private Build house;

	private int rooms;
	
	private String streetAdress;

	public HouseBuilder(int numberRooms, String adress) {
		house = new Build();
		this.rooms = numberRooms;
		house.setRooms(numberRooms);
		this.streetAdress = adress;
		house.setStreetAdress(adress);

	}

	@Override
	public void typeBuilding() {
		house.setTypeBuilding("House");

	}

	@Override
	public Build getBuild() {
		return house;
	}

	@Override
	public int numberRooms() {
		return rooms;
	}

	@Override
	public String streetAdress() {
		return streetAdress;
	}

}
