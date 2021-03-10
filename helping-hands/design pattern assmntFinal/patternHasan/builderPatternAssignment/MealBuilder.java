package builderPatternAssignment;

public class MealBuilder {

	public Meal prepareAdultMeal() {
		Meal meal = new Meal();
		meal.addItem(new Pizza());
		meal.addItem(new Coke());
		meal.addItem(new Muffin());
		meal.addItem(new Hat());
		return meal;
	}

	public Meal prepareChildMeal() {
		Meal meal = new Meal();
		meal.addItem(new Burger());
		meal.addItem(new Pepsi());
		meal.addItem(new Donut());
		meal.addItem(new Car());
		return meal;
	}
}