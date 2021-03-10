package Assignment;

public class Meal implements FoodPackage{

	private Drinks drinks;
	private MainItems mainItems;
	private Candied sweet;
	
	
	public Meal() {
		drinks = new Drinks();
		mainItems = new MainItems();
		sweet = new Candied();
		
		addDrinks();
		addMainFood();
		addSweet();
	}
	
	
	@Override
	public void addDrinks() {
		drinks.addItems(new Water());
		drinks.addItems(new CocaCola());
	}

	@Override
	public void addMainFood() {
		mainItems.addItems(new Rice());
		mainItems.addItems(new Meat());
		
	}

	@Override
	public void addSweet() {	
		sweet.addItems(new Dahi());
		
	}



	@Override
	public void printFoodPackage() {
		System.out.println("Dettails of Meal:::");
		System.out.println("::::::::::::::::::::::::::::::");
		drinks.listDetails();
		mainItems.listDetails();
		sweet.listDetails();
		
	}

}
