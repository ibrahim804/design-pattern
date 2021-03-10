package test;

public class Adapter implements MediaPlayer{

	private IAdvanceMediaPalyer advancePlayer;
	public Adapter(IAdvanceMediaPalyer advancePlayer) {
		this.advancePlayer = advancePlayer;
	}
	
	@Override
	public void play() {
		advancePlayer.playFile();
	}

}
