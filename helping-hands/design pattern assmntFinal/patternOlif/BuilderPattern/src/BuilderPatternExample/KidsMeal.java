package BuilderPatternExample;

public class KidsMeal implements MealPlan {
	Meal meal;
	public KidsMeal() {
		// TODO Auto-generated constructor stub
		meal=new Meal();
	}
	@Override
	public void setMainFood() {
		// TODO Auto-generated method stub
		MainFood mainFood=new Burger();
		meal.setMainFood(mainFood);
	}

	@Override
	public void setDrink() {
		// TODO Auto-generated method stub
		Drink drink=new Pepsi();
		meal.setDrink(drink);
	}

	@Override
	public void setDessert() {
		// TODO Auto-generated method stub
		Dessert dessert=new Chocolate();
		meal.setDessert(dessert);
	}

	@Override
	public void setGift() {
		// TODO Auto-generated method stub
		Gift gift=new Car();
		meal.setGift(gift);
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}
}
