package HouseBuilder;

public class HouseConstructor implements HouseBuilder{

	private House house;
	
	public HouseConstructor(){
		house = new House();
		
	}
	
	@Override
	public void buildRooms(int room) {
		house.setRooms(room);
	}

	@Override
	public void buildDoors(int door) {
		house.setDoors(door);

	}

	@Override
	public void buildWindows(int window) {
		house.setWindows(window);

	}

	@Override
	public void buildFloors(int floor) {

		house.setFloors(floor);

	}

	@Override
	public House getHouse() {

		return house;
	}

	@Override
	public void setNewHouse() {
		house = new House();
		
	}

}
