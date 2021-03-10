package all;

public class MuteRemote extends Remote{

	public MuteRemote(ElectronicDevice electronicDevice) {
		super(electronicDevice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void centerButton() {
		System.out.println("video mute");
		
	}

}
