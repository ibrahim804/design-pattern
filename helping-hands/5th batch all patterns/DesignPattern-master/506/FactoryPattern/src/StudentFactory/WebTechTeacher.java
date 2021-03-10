package StudentFactory;

public class WebTechTeacher extends AbsTeacher{

	public WebTechTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void otherDetails() {
		System.out.println("I teach web technology.");
	}

}
