package StudentFactory;

public class ParallelCourseStudent extends AbsStudent {

	public ParallelCourseStudent(int roll, String name) {
		super(roll, name);
	}

	@Override
	public void printOtherDetails() {
		System.out.println("Parallel Computing is my favourite course.");
	}
}
