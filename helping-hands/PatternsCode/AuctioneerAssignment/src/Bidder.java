import java.util.Scanner;

public abstract class Bidder {

	protected Auctioneer auctioneer;
	protected String name;
	protected Scanner inp;

	protected void getCurrentBid(String highestBidder) {
		System.out.print("Hello "+name+", ");
		System.out.print("Current bid is "+auctioneer.getPrice()+", ");
		System.out.println("Bidder is "+highestBidder);
	}
	
	protected abstract void takeANewBid();
	
}
