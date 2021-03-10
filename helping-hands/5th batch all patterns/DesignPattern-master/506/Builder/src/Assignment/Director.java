package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Director {
		
	private Map<String, FoodPackage> foodPackageMap;
	
	public Director() {
		foodPackageMap = new HashMap<>();
		init();
	}
	
	
	private void init() {
		foodPackageMap.put("breakfast", new BreakFast());
		foodPackageMap.put("meal", new Meal());
		foodPackageMap.put("snakes", new Snakes());
		
	}


	public FoodPackage getPackage(String packageName) {
		return foodPackageMap.get(packageName);
	}
	
}
