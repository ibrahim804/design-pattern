package StudentFactory;

public abstract class AbsStudent {

	protected int roll;
	protected String name;
	
	public AbsStudent(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public void myDetsils() {
		printNameANDRoll();
		printOtherDetails();
	}
	
	public abstract void printOtherDetails();

	protected void printNameANDRoll() {
		System.out.println("I am " + name);
		System.out.println("My roll is " + roll);
	}
	
}
