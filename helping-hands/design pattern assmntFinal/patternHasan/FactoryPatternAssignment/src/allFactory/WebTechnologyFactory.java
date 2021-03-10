package allFactory;

import course.ICourse;
import course.WebTechnologyCourse;
import student.AStudent;
import student.WebTechnologyStudent;
import teacher.ITeacher;
import teacher.WebTechnologyTeacher;

public class WebTechnologyFactory extends AbstractFactory {

	@Override
	public ITeacher provideTeacher() {
		ITeacher teacher=new WebTechnologyTeacher();
		return teacher;
	}

	@Override
	public ICourse provideCourse() {
		ICourse course=new WebTechnologyCourse();
		return course;
	}

	@Override
	public AStudent provideStudent() {
		AStudent student=new WebTechnologyStudent();
		return student;
	}

}
