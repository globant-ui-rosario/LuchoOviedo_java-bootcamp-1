package HouseBuilder;

public class BigHouseBuilder implements HouseBuilder{

	private House house;
	
	public BigHouseBuilder(){
		house = new House();
	}
	
	@Override
	public void buildRooms() {
		house.setRooms(11);
	}

	@Override
	public void buildDoors() {
		house.setDoors(15);

	}

	@Override
	public void buildWindows() {
		house.setWindows(18);

	}

	@Override
	public void buildFloors() {

		house.setFloors(3);

	}

	@Override
	public House getHouse() {

		return house;
	}

}
