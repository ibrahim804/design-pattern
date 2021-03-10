package main;

import observer.CompanyA;
import observer.Observer;
import observer.Subject;
import observer.UserA;

public class Test {

	public static void main(String[] args) {
		Subject company;
		company = new CompanyA(200);
		
		Observer observer1;
		observer1 = new UserA();
		company.registerObserver(observer1);
		((CompanyA) company).increaseSalePrice(20);
	}
}
