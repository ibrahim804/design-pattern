package main;

public class Gold extends Observer {

	public Gold (Channel channel) {
		this.channel=channel;
		this.channel.addUser(this);
	}
	
	@Override
	protected void update() {
		// TODO Auto-generated method stub
		System.out.println(channel.getCost()+" Notified from Gold");
	}

}
