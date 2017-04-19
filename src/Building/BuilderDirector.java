package Building;

public class BuilderDirector {

	private Builder Builder = null;

	public BuilderDirector(Builder Builder) {
		this.Builder = Builder;
	}

	public void constructBuild() {
		Builder.typeBuilding();
		Builder.numberRooms();

	}

	public Build getBuild() {
		return Builder.getBuild();
	}

}
