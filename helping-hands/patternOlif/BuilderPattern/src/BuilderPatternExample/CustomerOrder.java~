package BuilderPatternExample;

import java.util.HashMap;

public class CustomerOrder {

	MealPlan mealPlan;

	HashMap<String, MealPlan> orderMap = new HashMap<>();
	
	
	public CustomerOrder() {}
	
	public void receiveCustomerOrder(String choice) {
		
		
		orderMap.put("a", new AdultMeal());
		orderMap.put("k", new KidsMeal());
		
		mealPlan = orderMap.get(choice);
	}
	
	public void prepare() {
		// TODO Auto-generated method stub
		mealPlan.setMainFood();
		mealPlan.setDrink();
		mealPlan.setDessert();
		mealPlan.setGift();
	}
	public Meal getFood() {
		// TODO Auto-generated method stub
		return mealPlan.getMeal();
	}
}
