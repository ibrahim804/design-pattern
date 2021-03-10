package main;

import java.util.ArrayList;

public class Flag extends CompositeShape {

	@Override
	protected void buildShape() {
		// TODO Auto-generated method stub
		shape = new ArrayList <IShape> ();
		shape.add(new Rectangle());
		shape.add(new Circle(5, 6, 7));
	}

}
