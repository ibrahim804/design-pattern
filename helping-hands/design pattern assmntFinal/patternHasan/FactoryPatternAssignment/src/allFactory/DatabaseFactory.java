package allFactory;

import course.DatabaseCourse;
import course.ICourse;
import student.DatabaseStudent;
import student.AStudent;
import teacher.DatabaseTeacher;
import teacher.ITeacher;

public class DatabaseFactory extends AbstractFactory {

	@Override
	public ITeacher provideTeacher() {
		ITeacher teacher=new DatabaseTeacher();
		return teacher;
	}

	@Override
	public ICourse provideCourse() {
		ICourse course=new DatabaseCourse();
		return course;
	}

	@Override
	public AStudent provideStudent() {
		AStudent student=new DatabaseStudent();
		return student;
	}

}
