package users;

import interfaces.IUser;

public class User implements IUser{
	private String name;
	
	
	public User(String name) {
		this.name = name;
	}
	
	
	public String getName(){
		return name;
	}


	@Override
	public void sendMessageToGroup(String message, FacebookGroup group) {
		System.out.println("I am sending " + name);
		group.sendMessage(this, message);
	}


	@Override
	public void receiveMessage(String message) {
		System.out.println("I am " + name);
		System.out.println("I received message-> " + message);
	}
	
}
