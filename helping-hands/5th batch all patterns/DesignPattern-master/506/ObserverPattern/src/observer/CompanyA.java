package observer;

public class CompanyA extends Subject{
	private int salePrize;
	
	public CompanyA(int price) {
		this.salePrize = price;
	}
	
	
	public void increaseSalePrice(int price) {
		if(price > 0) {
			salePrize += price;
			String message = "price increased " + price+ ", now total price = " + salePrize;
			notifyAllObserver(message);
		}
	}
}
