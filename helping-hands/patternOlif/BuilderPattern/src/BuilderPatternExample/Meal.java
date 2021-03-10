package BuilderPatternExample;

public class Meal implements MealContent {
	public MainFood mainFood;
	public Drink drink;
	public Dessert dessert;
	public Gift gift;
	
	@Override
	public void setMainFood(MainFood mainFood) {
		// TODO Auto-generated method stub
		this.mainFood = mainFood;
	}
	@Override
	public void setDrink(Drink drink) {
		// TODO Auto-generated method stub
		this.drink = drink;
	}
	@Override
	public void setDessert(Dessert dessert) {
		// TODO Auto-generated method stub
		this.dessert = dessert;
	}
	@Override
	public void setGift(Gift gift) {
		// TODO Auto-generated method stub
		this.gift = gift;
	}
	

}
