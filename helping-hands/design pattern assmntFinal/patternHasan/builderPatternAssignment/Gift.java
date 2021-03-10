package builderPatternAssignment;

public abstract class Gift implements Item {
	
	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();
}
