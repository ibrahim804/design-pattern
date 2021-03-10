package Assignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter Package name(breakfast/meal/snakes): ");
		String packageName = scanner.nextLine();
		
		FoodPackage foodPackage = new Director().getPackage(packageName);
		
	foodPackage.printFoodPackage();
		
	}
}
