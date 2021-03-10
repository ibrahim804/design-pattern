package StudentFactory;

public class BusinessCommunicationTeacher extends AbsTeacher{

	public BusinessCommunicationTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void otherDetails() {
		System.out.println("I teach business communication.");
	}
}
