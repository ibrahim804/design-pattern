package Assignment;

import java.util.ArrayList;

public abstract class FoodList {
	
	protected ArrayList<FoodItem> foodItems;
	
	public FoodList() {
		foodItems = new ArrayList<>();
	}
	
	public void addItems(FoodItem foodItem) {
		foodItems.add(foodItem);
	}
	
	public void printAllItems() {
		for(int i = 0; i < foodItems.size(); i++) { 
			foodItems.get(i).foodItemDetails();
		}
	}
	
	public abstract void listDetails();

}
