package BuilderPatternExample;

public interface MealPlan {
	void setMainFood();
	void setDrink();
	void setDessert();
	void setGift();
	Meal getMeal();
}
