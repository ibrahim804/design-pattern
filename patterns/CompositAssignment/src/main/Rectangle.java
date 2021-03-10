package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Rectangle extends CompositeShape {
	
	
	public Rectangle(Graphics g) {
		super(g);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildShape() {
		// TODO Auto-generated method stub
		shape = new ArrayList <IShape> ();
		shape.add(new Line(10,10,410,10,g));
		shape.add(new Line(10,10,10,210,g));
		shape.add(new Line(10,210,410,210,g));
		shape.add(new Line(410,10,410,210,g));
	}
	
	

}
