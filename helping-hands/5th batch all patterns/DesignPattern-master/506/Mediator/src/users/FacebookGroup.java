package users;

import java.util.ArrayList;

import interfaces.IGroup;

public abstract class FacebookGroup implements IGroup{

	protected ArrayList<User> allUser;
	
	public FacebookGroup() {
		allUser = new ArrayList<>();
	}
	
	@Override
	public void addUser(User user) {
		allUser.add(user);
		
	}

	public abstract void sendMessage(User user, String message);
	

}
