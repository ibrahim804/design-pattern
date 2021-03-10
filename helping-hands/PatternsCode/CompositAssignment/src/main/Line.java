package main;

import java.awt.Color;
import java.awt.Graphics;

public class Line implements IShape {
	
	private int x1, y1, x2, y2;
	private Graphics g;

	public Line(int x1, int y1, int x2, int y2, Graphics g) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.g=g;
	}
	
	public void draw() {
		g.setColor(Color.BLACK);
		g.drawLine(x1, y1, x2, y2);
		//System.out.println("Line Draw at ("+x1+","+y1+") ("+x2+","+y2+")");
	}
	
	
}
