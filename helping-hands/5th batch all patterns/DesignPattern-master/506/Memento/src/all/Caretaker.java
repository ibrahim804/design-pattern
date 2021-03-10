package all;

import java.util.ArrayList;

public class Caretaker {
	
	private ArrayList<Memento> allMemento;
	public Caretaker() {
		allMemento = new ArrayList<>();
	}
	
	public void addMemento(Memento memento) {
		allMemento.add(memento);
	}
	
	public Memento getMemento(int i) {
		return allMemento.get(i);
	}

}
