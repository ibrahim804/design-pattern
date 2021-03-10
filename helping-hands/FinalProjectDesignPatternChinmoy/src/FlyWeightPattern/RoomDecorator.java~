package FlyWeightPattern;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class RoomDecorator {

	ArrayList<Color> clr = new ArrayList<Color>();
	ArrayList<String> flowerName = new ArrayList<String>();

	FlowerFactory flowerFactory;
	int X = 30, Y = 30;

	public RoomDecorator() {

		initColor();
		initFlower();

		flowerFactory = new FlowerFactory();
		decorate();
	}

	public void decorate() {

		for (int i = 0; i < flowerName.size(); i++) {
			Flowers flower = flowerFactory.createFlower(flowerName.get(i));

			flower.setColor(clr.get((int) (Math.random() * clr.size())));

			flower.setSize((int) (Math.random() * 160));
			flower.showFlowerDetails();
		}

	}

	private void initColor() {
		clr.add(Color.MAGENTA);
		clr.add(Color.CYAN);
		clr.add(Color.PINK);
		clr.add(Color.BLACK);
		clr.add(Color.BLUE);
	}

	private void initFlower() {
		flowerName.add("Rose");
		flowerName.add("Lily");
		flowerName.add("Sun Flower");
		flowerName.add("Rose-Mary");
		flowerName.add("Daisy");
		flowerName.add("Snap Dragon");
		flowerName.add("Flamingo Flower");
	}
}
