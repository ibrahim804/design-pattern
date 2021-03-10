package StudentFactory;

public class ParallelCourseTeacher extends AbsTeacher{

	public ParallelCourseTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void otherDetails() {
		System.out.println("I teach parallel computing");
	}

}
