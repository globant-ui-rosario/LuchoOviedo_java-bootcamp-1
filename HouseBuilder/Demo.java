package HouseBuilder;

public class Demo {

	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new HouseConstructor();
		houseBuilder.buildDoors(5);
		houseBuilder.buildFloors(2);
		houseBuilder.buildRooms(6);
		houseBuilder.buildWindows(10);
		House house = houseBuilder.getHouse();
		System.out.println("House have: " + house);
		
		houseBuilder.setNewHouse();
		houseBuilder.buildDoors(12);
		houseBuilder.buildFloors(4);
		houseBuilder.buildRooms(17);
		houseBuilder.buildWindows(20);
		House bigHouse = houseBuilder.getHouse();
		System.out.println("House have: " + bigHouse);
		
		

	}
	
}
