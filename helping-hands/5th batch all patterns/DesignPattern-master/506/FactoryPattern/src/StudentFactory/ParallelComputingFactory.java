package StudentFactory;

public class ParallelComputingFactory extends Factory{

	@Override
	public void bulitCourse() {
		course = new Course("Parallel Computing : 501");
		
	}

	@Override
	public void addStudentsToCourse() {
		course.addStudent(new ParallelCourseStudent(801, "Thamid Khan"));
		course.addStudent(new ParallelCourseStudent(802, "Iftekhar Jamil"));
		course.addStudent(new ParallelCourseStudent(803, "Tahlil"));
		course.addStudent(new ParallelCourseStudent(804, "Ibrahim Khalil"));
		course.addStudent(new ParallelCourseStudent(806, "Toukir Ahamed"));
		course.addStudent(new ParallelCourseStudent(807, "Mahir Mahbub"));
		
	}

	@Override
	public void addTeacherToCourse() {
		course.addTeacher(new ParallelCourseTeacher("Raju"));
	}
	
}
