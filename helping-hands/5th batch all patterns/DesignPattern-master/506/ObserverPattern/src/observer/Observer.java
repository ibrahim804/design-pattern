package observer;

public abstract class Observer {
	public void getNotification(String message) {
		System.out.println(message);
	}
}
