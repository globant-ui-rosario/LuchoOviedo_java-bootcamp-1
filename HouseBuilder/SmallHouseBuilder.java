package HouseBuilder;

public class SmallHouseBuilder implements HouseBuilder {

	private House house;

	public SmallHouseBuilder(){
		house = new House();
	}
	
	@Override
	public void buildRooms() {
		house.setRooms(5);
	}

	@Override
	public void buildDoors() {
		house.setDoors(8);

	}

	@Override
	public void buildWindows() {
		house.setWindows(7);

	}

	@Override
	public void buildFloors() {

		house.setFloors(1);

	}

	@Override
	public House getHouse() {

		return house;
	}

}
