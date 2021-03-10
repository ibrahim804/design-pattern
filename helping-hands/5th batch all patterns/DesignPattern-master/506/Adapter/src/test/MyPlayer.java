package test;

public class MyPlayer {
	private IAdvanceMediaPalyer advancePlayer;
	private MediaPlayer mediaPlayer;
	
	public MyPlayer(IAdvanceMediaPalyer advancePlayer) {
		this.advancePlayer = advancePlayer; 
	}
	public MyPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	
	public void play() {
		if(advancePlayer != null)
			advancePlayer.playFile();
		else mediaPlayer.play();
	}
	
}
