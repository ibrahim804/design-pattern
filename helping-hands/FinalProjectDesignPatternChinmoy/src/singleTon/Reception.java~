package singleTon;

import java.util.ArrayList;
import java.util.Scanner;

import FlyWeightPattern.RoomDecorator;
import familyFactory.DeluxRoom;
import familyFactory.IRoomFactory;
import familyFactory.LuxuryRoom;
import familyFactory.RegularRoom;
import observerPattern.Guest;
import observerPattern.IGuest;

public class Reception {

	private static Reception instance = null;
	private ArrayList<IGuest> guests;
	private ArrayList<IRoomFactory> roomType;
	
	private Reception(){
		initGuest();
		initRoom();
		selectRoom();
		notifyAllGuest();
	}
	
	public static Reception getInstance(){
		if(instance==null){
			instance = new Reception(); 
		}return instance;
	}
	private void initGuest(){
		guests =  new ArrayList<IGuest>();
		guests.add(new Guest("Ibrahim", new LuxuryRoom()));
		guests.add(new Guest("Imam", new RegularRoom()));
		guests.add(new Guest("Shaanto", new DeluxRoom()));
	}
	private void initRoom(){
		roomType = new ArrayList<IRoomFactory>();
		roomType.add(new LuxuryRoom());
		roomType.add(new DeluxRoom());
		roomType.add(new RegularRoom());
	}
	private void addGuest(String name,IRoomFactory room){
		guests.add(new Guest(name, room));
		System.out.println("New Guest: "+ name+" added.");
		System.out.println("Room Details: "+room.roomDetails());
		System.out.println("We decorated the room with: ");
		new RoomDecorator();
		System.out.println();
		System.out.println();
		
		
		
	}
	
	private void selectRoom(){
		System.out.println("Enter Your Name");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Select Choice:");
		System.out.println("1. Luxury Room");
		System.out.println("2. Delux Room");
		System.out.println("3. Regular Room");
		
		IRoomFactory room =  roomType.get(new Scanner(System.in).nextInt()-1);
		addGuest(name, room);
		
	}
	private void notifyAllGuest(){
		String notificationIssue = "Got Fire";
		for(int i =0;i<guests.size();i++){
			guests.get(i).getNotified(notificationIssue);
		}
			
	}
}
