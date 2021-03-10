	
public class Auction {

	public static Auction auction = new Auction();
	
	private Bidder [] bidder;
	private int currentPrice, previousPrice=0;
	private int turn=0;

	private Auction() {
		
	}
	
	public static Auction getInstance() {
		return auction;
	}
	
	public void setField(Bidder[] bidder, int previousPrice) {
		this.bidder = bidder;
		this.previousPrice=previousPrice;
	}

	public void startAuction() {
		
		int i=0;
		
		while(true) {
			
			i%=3;
			bidder[i].takeANewBid();
			
			if(isFinished()) {
				announceFinalBid(bidder[(i+1)%3].name);
				break;
			}
			
			i++;
		}
		
	}
	
	private boolean isFinished() {
		
		currentPrice=bidder[0].auctioneer.getPrice();
		
		if(currentPrice==previousPrice) {
			turn++;
			if(turn==2) return true;
		} else {
			previousPrice=currentPrice;
			turn=0;
		}
		
		return false;
	}
	
	private void announceFinalBid(String buyer) {
		System.out.println("");
		System.out.print("Auction is Over, Successful bidder is "+buyer);
		System.out.println(", And his bid is "+currentPrice);
	}
	
	
	
}
