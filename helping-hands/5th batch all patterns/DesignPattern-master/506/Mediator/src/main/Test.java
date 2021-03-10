package main;

import users.DPGroup;
import users.FacebookGroup;
import users.User;

public class Test {
	public static void main(String[] args) {
		
		FacebookGroup dpGroup = new DPGroup();
		
		User user = new User("Atiq");
		dpGroup.addUser(user);
		User user1 = new User("Shamim");
		dpGroup.addUser(user1);
		
		User user2 = new User("olife");
		dpGroup.addUser(user2);
		
		user.sendMessageToGroup("Primary message", dpGroup);
		
		
	}

}
