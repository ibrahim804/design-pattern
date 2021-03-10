package allFactory;

import course.DesignPatternCourse;
import course.ICourse;
import student.DesignPatternStudent;
import student.AStudent;
import teacher.DesignPatternTeacher;
import teacher.ITeacher;

public class DesignPatternFactory extends AbstractFactory {

	@Override
	public ITeacher provideTeacher() {
		ITeacher teacher=new DesignPatternTeacher();
		return teacher;
	}

	@Override
	public ICourse provideCourse() {
		ICourse course=new DesignPatternCourse();
		return course;
	}

	@Override
	public AStudent provideStudent() {
		AStudent student=new DesignPatternStudent();
		return student;
	}

}
