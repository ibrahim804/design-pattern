package main;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements IShape {

	private int r;
	private Graphics g;

	public Circle(int r, Graphics g) {
		super();
		this.r = r;
		this.g=g;
	}
	
	public void draw() {
		g.setColor(Color.RED);
		g.fillOval(210-r/2, 110-r/2, r, r);
		//System.out.println("Circle Draw at ("+x+","+y+","+r+")");
	}
	
}
