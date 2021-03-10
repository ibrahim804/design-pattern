package StudentFactory;

public class DesignPatternTeacher extends AbsTeacher{

	public DesignPatternTeacher(String name) {
		super(name);
	}

	@Override
	public void otherDetails() {
		System.out.println("I taech deasign pattern.");
		
	}
	
}
