package StudentFactory;

public class DBSM2Student extends AbsStudent{
	
	public DBSM2Student(int roll, String name) {
		super(roll, name);
	}

	@Override
	public void printOtherDetails() {
		System.out.println("In this course We learn about datamining");
	}
}
