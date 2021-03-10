package StudentFactory;

public class WebTechStudent extends AbsStudent{
	
	public WebTechStudent(int roll, String name) {
		super(roll, name);
	}

	@Override
	public void printOtherDetails() {
		System.out.println("I am learning HTML, CSS, JS and PHP in this course");
	}
}
