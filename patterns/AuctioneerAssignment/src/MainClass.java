
public class MainClass {
	
	public static void main(String [] args) {
		
		Bidder bidder [] = new Bidder[3];
		
		Auctioneer auctioneer = new Auctioneer ();
		
		bidder [0] = new Candidate(auctioneer,"Ibrahim");
		bidder [1] = new Candidate(auctioneer,"Jamil");
		bidder [2] = new Candidate(auctioneer,"Tuhin");
		
		System.out.println("Current Bid is "+auctioneer.getPrice());
		
		Auction auction = Auction.getInstance();
		auction.setField(bidder, auctioneer.getPrice());
		auction.startAuction();
	
	}
	
}
