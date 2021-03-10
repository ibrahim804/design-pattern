package student;

import java.util.ArrayList;

public class DesignPatternStudent extends AStudent{
	
	public DesignPatternStudent() {
		studentList=new ArrayList<>();
		
		studentList.add("Shihab");
		studentList.add("Uddin");
	}
	@Override
	public void display() {
		System.out.println("DesignPattern Student Student");
		for (String string : studentList) {
			System.out.println(string);
		}
	}

}
