package all;

public class Originator {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		caretaker.addMemento(new Memento("memento 1"));
		caretaker.addMemento(new Memento("memento 2"));
		caretaker.addMemento(new Memento("memento 3"));
		caretaker.addMemento(new Memento("memento 4"));
		caretaker.addMemento(new Memento("memento 5"));
		caretaker.addMemento(new Memento("memento 6"));
		caretaker.addMemento(new Memento("memento 7"));
		caretaker.addMemento(new Memento("memento 8"));
		
		
		System.out.println(caretaker.getMemento(5).getStatus());
	}
	
	
	
	
	
	
}
