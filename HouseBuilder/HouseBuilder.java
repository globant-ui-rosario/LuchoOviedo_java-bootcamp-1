package HouseBuilder;

public interface HouseBuilder {
	
	public void buildRooms(int room);
	public void buildDoors(int door);
	public void buildWindows(int window);
	public void buildFloors(int floor);
	public House getHouse();
	public void setNewHouse();

}
