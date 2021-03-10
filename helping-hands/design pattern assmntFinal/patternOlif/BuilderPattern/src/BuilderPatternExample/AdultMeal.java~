package BuilderPatternExample;

public class AdultMeal implements MealPlan {
	Meal meal;
	
	public AdultMeal() {
		// TODO Auto-generated constructor stub
		meal=new Meal();
	}
	@Override
	public void setMainFood() {
		// TODO Auto-generated method stub
		MainFood mainFood=new Pizza();
		meal.setMainFood(mainFood);
	}

	@Override
	public void setDrink() {
		// TODO Auto-generated method stub
		Drink drink=new FruitJuice();
		meal.setDrink(drink);
	}

	@Override
	public void setDessert() {
		// TODO Auto-generated method stub
		Dessert dessert=new IceCream();
		meal.setDessert(dessert);
	}

	@Override
	public void setGift() {
		// TODO Auto-generated method stub
		Gift gift=new Cap();
		meal.setGift(gift);
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
