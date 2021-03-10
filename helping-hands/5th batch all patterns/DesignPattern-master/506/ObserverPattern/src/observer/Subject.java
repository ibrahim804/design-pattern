package observer;

import java.awt.List;
import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers;
	
	
	public Subject() {
		observers = new ArrayList<>();
	}
	
	
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		
	}
	
	public void notifyAllObserver(String message) {
		for(Observer observer: observers) {
			observer.getNotification(message);
		}
	}



	
}
