package StudentFactory;

public class BusinessCommunicationStudent extends AbsStudent{
	
	public BusinessCommunicationStudent(int roll, String name) {
		super(roll, name);
	}

	@Override
	public void printOtherDetails() {
		System.out.println("This is my one of the favourite course. Teacher teach us few time in this course.");
	}
}
