package main;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private List <Observer> user = new ArrayList <Observer> ();
	private int cost=0;
	
	public int getCost() {
		return cost;
	}
	
	public void updateCost(int change) {
		cost=change;
		System.out.println("cost changed !!");
		notifyAllUsers();
	}
	
	public void addUser(Observer objUser) {
		user.add(objUser);
	}
	
	private void notifyAllUsers() {
		for(Observer iteratot : user) {
			iteratot.update();
		}
	}
	
}
