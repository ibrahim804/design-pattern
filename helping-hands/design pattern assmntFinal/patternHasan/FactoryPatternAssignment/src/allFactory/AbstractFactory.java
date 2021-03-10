package allFactory;

import course.ICourse;
import student.AStudent;
import teacher.ITeacher;

public abstract class AbstractFactory {
	public abstract ITeacher provideTeacher();
	public abstract ICourse provideCourse();
	public abstract AStudent provideStudent();
}
