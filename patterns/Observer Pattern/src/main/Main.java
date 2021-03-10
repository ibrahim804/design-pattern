package main;

public class Main {
	public static void main(String [] args) {
		
		Channel channel = new Channel();
		
		new Platinum(channel);
		new Diamond(channel);
		new Gold(channel);
		
		channel.updateCost(12);
		channel.updateCost(21);
		channel.updateCost(17);
	}
}

