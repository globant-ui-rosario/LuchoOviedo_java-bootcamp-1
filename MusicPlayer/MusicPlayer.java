package MusicPlayer;

public class MusicPlayer {

	PlayerState playerState;
	
	public MusicPlayer() {
		this.playerState = new Stopped();
	}

	public void stop(){
		this.playerState = new Stopped();
		this.playerState.status();
	}
	
	public void playing(){
		this.playerState = new Playing();
		this.playerState.status();
	}
	
	public void paused(){
		this.playerState = new Paused();
		this.playerState.status();
	}
	
}

