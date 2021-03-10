package student;

import java.util.ArrayList;

public class DatabaseStudent extends AStudent {
	
	public DatabaseStudent() {
		studentList=new ArrayList<>();
		
		studentList.add("Hasan");
		studentList.add("Tarek");
		studentList.add("Shohan");
	}
	@Override
	public void display() {
		System.out.println("Database Student List");
		for (String string : studentList) {
			System.out.println(string);
		}
	}
	
	

}
