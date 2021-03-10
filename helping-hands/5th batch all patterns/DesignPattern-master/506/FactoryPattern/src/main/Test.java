package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import factory.IFactory;
import factory.IRoom;
import factory.WoodenRoom;

public class Test {

	

	public static void main(String[] args) {
		Factory factory = new Factory();

		Scanner input = new Scanner(System.in);
		String familyType = input.nextLine();
		
		
		IFactory myFactory = factory.getFactory(familyType);
		
		IRoom room = myFactory.createRoom();
		room.printRoomType();
		
		//IRoom room = factory.getFactory(familyType);
		
		
		/*IRoom myRoom = factory.getRoom(roomName);
		myRoom.printRoomType();*/
		
		
		input.close();
	}
	
	

}
