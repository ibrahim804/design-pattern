package FlyWeightPattern;

import java.awt.Color;

public class Flowers {
	//instrinsic
	
	public String name;

	// Extrinsic

	private Color color = Color.BLACK;
	public int size = 20;

	public Flowers(String name) {
		this.name = name;
		
	}

	public void setColor(Color color) {
		this.color = color;
		
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void showFlowerDetails(){
		System.out.println("Flower name: "+ this.name+ ", Size: "+ this.size+", Color"+this.color);
	}

}
