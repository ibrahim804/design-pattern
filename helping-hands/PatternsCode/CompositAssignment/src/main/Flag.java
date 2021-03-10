package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Flag extends CompositeShape {
	
	public Flag(Graphics g) {
		super(g);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildShape() {
		// TODO Auto-generated method stub
		shape = new ArrayList <IShape> ();
		shape.add(new Rectangle(g));
		shape.add(new Circle(50,g));
	}

}
