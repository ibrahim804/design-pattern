package StudentFactory;

public class DesignPatternStudent extends AbsStudent{
	
	public DesignPatternStudent(int roll, String name) {
		super(roll, name);
	}

	@Override
	public void printOtherDetails() {
		System.out.println("we are learning beautiful patterns.");
	}
	
}
