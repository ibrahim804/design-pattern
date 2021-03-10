package Tour;

public abstract class Tour {
	public void makeATour() {
		journeyFromDhakaToCox();
		khoyaDaoya();
		roamingAround();
		journeyFromCoxToDhaka();
	}
	
	abstract void journeyFromCoxToDhaka();
	abstract void roamingAround();
	abstract void journeyFromDhakaToCox();
	abstract void khoyaDaoya();
}
