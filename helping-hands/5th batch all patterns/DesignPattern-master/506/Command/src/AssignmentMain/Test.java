package AssignmentMain;

import assignemtFascade.CommandProcessor;

public class Test {

	public static void main(String[] args) {
		System.out.println("Design Pattern Assignment Command");
		System.out.println("---------------------------------");
		System.out.println();
		
		CommandProcessor processor = new CommandProcessor();
		processor.proceed();
	}

}
