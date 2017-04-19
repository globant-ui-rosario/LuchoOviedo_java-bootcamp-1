package Building;

public class Demo {

	public static void main(String[] args) {

		Builder houseBuilder = new HouseBuilder(7,"Balcarce 4575");
		BuilderDirector builderDirector = new BuilderDirector(houseBuilder);
		builderDirector.constructBuild();
		Build build = builderDirector.getBuild();
		System.out.println("Building is: " + build);
		
	}

	
}
