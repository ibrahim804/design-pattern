package builderPatternAssignment;

public abstract class MainCourse implements Item {
	
	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();
}
