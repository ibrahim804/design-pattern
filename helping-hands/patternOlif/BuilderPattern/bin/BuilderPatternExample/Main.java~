package BuilderPatternExample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String choise;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice : ");
		choise = sc.nextLine();
		sc.close();
		CustomerOrder cOrder=new CustomerOrder();
		cOrder.receiveCustomerOrder(choise);
		cOrder.prepare();
		Meal meal=cOrder.getFood();
		meal.mainFood.mainFoodName();
		meal.drink.drinkName();
		meal.dessert.dessertName();
		meal.gift.giftName();
	}
}
