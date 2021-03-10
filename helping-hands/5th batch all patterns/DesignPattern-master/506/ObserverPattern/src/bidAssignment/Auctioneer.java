package bidAssignment;

import java.util.ArrayList;

import observer.Observer;

public class Auctioneer extends BidObserver{

	
	private int currentPrice;
	
	private static Auctioneer auctioneer;
	private ArrayList<BidObserver> bidObservers;
	
	public static Auctioneer getAuctioneer() {
		if(auctioneer == null) {
			synchronized (Auctioneer.class) {
				if(auctioneer == null) {
					auctioneer = new Auctioneer();
				}
				return auctioneer;
			}
		}
		return auctioneer;
	}
	
	
	public Auctioneer() {
		bidObservers = new ArrayList<>();
		currentPrice = 0;
	}
	
	public void addObserver(BidObserver observer) {
		bidObservers.add(observer);
	}
	
	public void updatePrice(int amount) {
		if(amount > currentPrice) {
			currentPrice = amount;
			for(BidObserver observer: bidObservers) {
				observer.getBidLeatestNotification("Leatest price is " + currentPrice+ " now");
			}
			getBidLeatestNotification("Leatest price is " + currentPrice+ " now");
		}
	}
	
}
