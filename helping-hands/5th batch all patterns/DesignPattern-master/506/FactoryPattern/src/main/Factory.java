package main;

import java.util.HashMap;
import java.util.Map;

import factory.GlassFactory;
import factory.GlassRoom;
import factory.IFactory;
import factory.IRoom;
import factory.StealFactory;
import factory.StealRoom;
import factory.WoodenFactory;
import factory.WoodenRoom;

public class Factory {
	private Map<String, IRoom> rooms;
	private Map<String, IFactory> factories;
	
	public Factory() {
		initializeRooms();
		initializeFactories();
	}

	private void initializeFactories() {
		factories = new HashMap<>();
		factories.put("w", new WoodenFactory());
		factories.put("g", new GlassFactory());
		factories.put("s", new StealFactory());
		
	}
	
	

	private void initializeRooms() {
		rooms = new HashMap<>();
		rooms.put("wooden room", new WoodenRoom());
		rooms.put("glass room", new GlassRoom());
		rooms.put("steal room", new StealRoom());
		
	}

	public IRoom getRoom(String roomName) {
		return rooms.get(roomName);
	}

	public IFactory getFactory(String familyType) {
		return factories.get(familyType);
	}
	
}
