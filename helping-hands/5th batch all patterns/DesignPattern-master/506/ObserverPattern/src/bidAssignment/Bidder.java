package bidAssignment;

public class Bidder extends BidObserver{

	public void bid(int amount) {
		Auctioneer auctioneer = Auctioneer.getAuctioneer();
		auctioneer.updatePrice(amount);
	}
	
}
