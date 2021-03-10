package FlyWeightPattern;


import java.util.HashMap;

public class FlowerFactory {

	private HashMap<String, Flowers> flower;

	public FlowerFactory() {

		this.flower = new HashMap<String, Flowers>();
	}

	public Flowers createFlower(String flowerName) {

		if (!flower.containsKey(flowerName))
			flower.put(flowerName, new Flowers(flowerName));

		return flower.get(flowerName);

	}

}

