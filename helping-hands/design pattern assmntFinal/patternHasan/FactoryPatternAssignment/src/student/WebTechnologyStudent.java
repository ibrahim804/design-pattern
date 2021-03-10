package student;

import java.util.ArrayList;

public class WebTechnologyStudent extends AStudent {
	
	public WebTechnologyStudent() {
		studentList=new ArrayList<>();
		
		studentList.add("Iftekhar");
		studentList.add("Jamil");
	}
	@Override
	public void display() {
		System.out.println("WebTechnology Students List");
		for (String string : studentList) {
			System.out.println(string);
		}
	}

}
