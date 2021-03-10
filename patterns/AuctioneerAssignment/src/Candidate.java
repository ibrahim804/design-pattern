import java.util.Scanner;

public class Candidate extends Bidder {

	public Candidate(Auctioneer auctioneer, String name) {
		this.auctioneer=auctioneer;
		this.name=name;
		this.auctioneer.attendToAuction(this);
		inp = new Scanner(System.in);
	}

	@Override
	protected void takeANewBid() {
		// TODO Auto-generated method stub
		System.out.print(this.name+", Enter your bid : ");
		auctioneer.changePrice(inp.nextInt(), name);
	}
	
	
}
