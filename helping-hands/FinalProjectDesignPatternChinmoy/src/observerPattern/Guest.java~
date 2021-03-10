package observerPattern;

import familyFactory.IRoomFactory;

public class Guest implements IGuest {
	public String name;
	public IRoomFactory roomBooked;

	public Guest(String name, IRoomFactory roomBooked) {
		this.name = name;
		this.roomBooked = roomBooked;
	}

	@Override
	public void getNotified(String notificationIssue) {

		String notifactionBody = "Dear " + this.name + ",[" + this.roomBooked.roomDetails() + "]"
				+ " Here is the news: " + notificationIssue;

		System.out.println(notifactionBody);

	}

}
