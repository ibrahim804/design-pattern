package Assignment;

public class Snakes implements FoodPackage{

	private Drinks drinks;
	private MainItems mainItems;
	private Candied sweet;
	
	
	public Snakes() {
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
		drinks.addItems(new Tea());
	}

	@Override
	public void addMainFood() {
		mainItems.addItems(new Barger());
		mainItems.addItems(new Biscuit());
		
	}

	@Override
	public void addSweet() {	
		sweet.addItems(new Sweet());
		
	}



	@Override
	public void printFoodPackage() {
		System.out.println("Dettails of Snakes:::");
		System.out.println("::::::::::::::::::::::::::::::");
		drinks.listDetails();
		mainItems.listDetails();
		sweet.listDetails();
		
	}

}
