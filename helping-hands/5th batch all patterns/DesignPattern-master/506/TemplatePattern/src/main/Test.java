package main;

import Tour.LuxaryTour;
import Tour.RelaxTour;
import Tour.Tour;

public class Test {

	public static void main(String[] args) {
		Tour tour;
		tour= new LuxaryTour();
		tour.makeATour();
		
		System.out.println();
		RelaxTour relaxTour = new RelaxTour();
		relaxTour.makeATour();
		
		
		
	}

}
