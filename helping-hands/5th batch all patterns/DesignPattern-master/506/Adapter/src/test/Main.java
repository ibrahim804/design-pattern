package test;

public class Main {
	 public static void main(String[] args) {
		
		 MP3Player mp3Player = new MP3Player();
		 MP4Player mp4Player = new MP4Player();
		 VLCPlayer vlcPlayer = new VLCPlayer();
		 
		 MyPlayer  myPlayer = new MyPlayer(vlcPlayer);
		 myPlayer.play();
		 
		 MediaPlayer mediaPlayer;
		 mediaPlayer = new Adapter(vlcPlayer);
		 mediaPlayer.play();
		 
		 mediaPlayer = new Adapter(mp4Player);
		 mediaPlayer.play();
		 mediaPlayer = new MP3Player();
		 mediaPlayer.play();
	}
}
