package main;

import java.util.Random;

import circle.Circle;
import factory.CircleFactory;

public class Test2 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		CircleFactory factory = new CircleFactory();

		Random rand = new Random();
		for (int i = 0; i < 100000000; i++) {
			factory.getCircle(rand.nextInt(1000) % 7).drow(rand.nextInt(1000), rand.nextInt(1000));
		}

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println((double) totalTime / 1000000);

		startTime = System.nanoTime();

		// Random rand = new Random();
		for (int i = 0; i < 100000000; i++) {
			new Circle(rand.nextInt(1000) % 7, rand.nextInt(1000), rand.nextInt(1000), rand.nextInt(1000)).drow();
		}

		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println((double) totalTime / 1000000);

	}

}
