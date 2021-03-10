package pkg1;
import java.util.Scanner;

import allFactory.AbstractFactory;
import course.ICourse;
import student.AStudent;
import teacher.ITeacher;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter your choice \n DB for database \n WT for Web Technology\n DP for Design Pattern");
		Scanner scan=new Scanner(System.in);
		String choice=scan.nextLine();
		
		Factory f=new Factory();
		
		AbstractFactory af=f.provideTC(choice);
		
		ITeacher teacher=af.provideTeacher();
		ICourse course=af.provideCourse();
		AStudent student=af.provideStudent();
		
		teacher.display();
		course.display();
		student.display();
	}

}
