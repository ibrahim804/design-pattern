import java.util.ArrayList;
import java.util.List;

public class Auctioneer {

	private int price=0;
	private List <Bidder> bidder = new ArrayList <Bidder> ();
	
	public int getPrice() {
		return price;
	}
	
	public void changePrice(int newPrice, String bidderName) {
		if(newPrice>price) {
			price=newPrice;
			notifyAllBidders(bidderName);
		}
	}
	
	public void attendToAuction(Bidder bd) {
		bidder.add(bd);
	}
	
	private void notifyAllBidders(String bidderName) {
		for(Bidder iterator : bidder) {
			iterator.getCurrentBid(bidderName);
		} System.out.println();
	}
	
}
