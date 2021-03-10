package builderPatternAssignment;

public abstract class Drink implements Item {
	
	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
}
