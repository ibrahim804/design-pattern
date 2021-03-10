package builderPatternAssignment;

public abstract class Desert implements Item {
	
	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();
}
