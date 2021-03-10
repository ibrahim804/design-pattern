package StudentFactory;

public abstract class AbsTeacher implements ITeacher{

	protected String name;
	public AbsTeacher(String name) {
		this.name = name;
	}
	
	@Override
	public void teacherDetails() {
		System.out.println("I am " + name);
		otherDetails();
	}
	
	protected abstract void otherDetails();

}
