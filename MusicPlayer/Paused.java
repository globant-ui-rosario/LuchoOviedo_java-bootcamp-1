package MusicPlayer;

public class Paused implements PlayerState {

	@Override
	public void status() {
		System.out.println("Current Status: Paused");
		
	}
	
}
