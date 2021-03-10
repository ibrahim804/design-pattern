package StudentFactory;

public class BusinessCommunicationFactory extends Factory{

	@Override
	public void bulitCourse() {
		course = new Course("Business communication - 503");
		
	}

	@Override
	public void addStudentsToCourse() {
		course.addStudent(new BusinessCommunicationStudent(816, "Imam Hossain Kawser"));
		course.addStudent(new BusinessCommunicationStudent(817, "Atiq Ahammed"));
		course.addStudent(new BusinessCommunicationStudent(818, "Hasan Tarek"));
		course.addStudent(new BusinessCommunicationStudent(819, "Chinmoy Achaerjee"));
		course.addStudent(new BusinessCommunicationStudent(821, "Sumaya Sammy"));
		course.addStudent(new BusinessCommunicationStudent(822, "Khayrul Islam"));
		
	}

	@Override
	public void addTeacherToCourse() {
		course.addTeacher(new BusinessCommunicationTeacher("Iftekhar Amin"));
		
	}

}
