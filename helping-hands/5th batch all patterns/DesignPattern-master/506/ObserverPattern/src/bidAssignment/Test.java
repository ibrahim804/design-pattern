package bidAssignment;

public class Test {

	public static void main(String[] args) {
		Auctioneer auctioneer = Auctioneer.getAuctioneer();
		Bidder bidder1 = new Bidder();
		Bidder bidder2 = new Bidder();
		
		auctioneer.addObserver(bidder1);
		auctioneer.addObserver(bidder2);
		
		bidder1.bid(20);
		bidder2.bid(30);
	}

}
