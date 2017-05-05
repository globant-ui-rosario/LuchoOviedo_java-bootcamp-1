package MusicPlayer;

public class Stopped implements PlayerState {

	@Override
	public void status() {
		System.out.println("Current Status: Stopped");
		
	}

}
