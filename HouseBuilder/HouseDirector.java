package HouseBuilder;

public class HouseDirector {

	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse() {

		houseBuilder.buildRooms();
		houseBuilder.buildDoors();
		houseBuilder.buildWindows();
		houseBuilder.buildFloors();

	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}

}
