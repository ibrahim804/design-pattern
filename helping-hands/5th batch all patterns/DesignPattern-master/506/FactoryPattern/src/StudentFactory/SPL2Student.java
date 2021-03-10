package StudentFactory;

public class SPL2Student extends AbsStudent{
	
	public SPL2Student(int roll, String name) {
		super(roll, name);
	}

	@Override
	public void printOtherDetails() {
		System.out.println("we are doing project in this course");
	}
}
