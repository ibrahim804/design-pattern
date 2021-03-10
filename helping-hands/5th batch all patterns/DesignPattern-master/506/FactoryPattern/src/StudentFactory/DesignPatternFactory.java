package StudentFactory;

public class DesignPatternFactory extends Factory{

	@Override
	public void bulitCourse() {
		course = new Course("Design Pattern - 506");
		
	}

	@Override
	public void addStudentsToCourse() {
		course.addStudent(new DesignPatternStudent(841, "Shamima Shoshy"));
		course.addStudent(new DesignPatternStudent(842, "Jewel Rana"));
		course.addStudent(new DesignPatternStudent(844, "Udddip Acharjee"));
		
		
	}

	@Override
	public void addTeacherToCourse() {
		course.addTeacher(new DesignPatternTeacher("Mayeenul Islam"));
		course.addTeacher(new DesignPatternTeacher("Nadia Nahar"));
		
	}
	
}
