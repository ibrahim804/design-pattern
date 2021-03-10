package main;

import java.util.List;

public abstract class CompositeShape implements IShape {

	protected List <IShape> shape;
	
	protected abstract void buildShape();
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		buildShape();
		for(IShape iterator : shape) {
			iterator.draw();
		}
	}
	
}
