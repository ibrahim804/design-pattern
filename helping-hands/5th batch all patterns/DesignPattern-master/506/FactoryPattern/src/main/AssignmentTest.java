package main;

import java.util.Scanner;

import StudentFactory.FactoryOFFactory;
import StudentFactory.ICourse;

public class AssignmentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.print("enter course number :   ");
			int courseNumber = scanner.nextInt();
			if (courseNumber > 500 && courseNumber < 507) {
				ICourse course = new FactoryOFFactory().getFactory(courseNumber).getCourse();
				course.printCourseDetailse();
			}
		}

	}
}
