package main;

public class Diamond extends Observer {

	public Diamond (Channel channel) {
		this.channel=channel;
		this.channel.addUser(this);
	}
	
	@Override
	protected void update() {
		// TODO Auto-generated method stub
		System.out.println(channel.getCost()+" Notified from Diamond");
	}

}
