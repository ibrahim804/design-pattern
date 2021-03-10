package main;

public class Platinum extends Observer {

	public Platinum (Channel channel) {
		this.channel=channel;
		this.channel.addUser(this);
	}
	
	@Override
	protected void update() {
		// TODO Auto-generated method stub
		System.out.println(channel.getCost()+" Notified from Platinum");
	}
	
}
