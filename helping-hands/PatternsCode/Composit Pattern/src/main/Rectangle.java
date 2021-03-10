package main;

import java.util.ArrayList;

public class Rectangle extends CompositeShape {

	@Override
	protected void buildShape() {
		// TODO Auto-generated method stub
		shape = new ArrayList <IShape> ();
		shape.add(new Line(1,2,3,4));
		shape.add(new Line(3,4,5,6));
		shape.add(new Line(5,6,7,8));
		shape.add(new Line(7,8,9,10));
	}

}
