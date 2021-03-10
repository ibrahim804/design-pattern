package StudentFactory;

public class DBSM2Teacher extends AbsTeacher{

	public DBSM2Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void otherDetails() {
		System.out.println("I teach data mining.");
		
	}

}
