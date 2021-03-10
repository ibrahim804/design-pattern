package main;

import java.awt.Graphics;
import java.util.List;

public abstract class CompositeShape implements IShape {

	protected List <IShape> shape;
	protected Graphics g;
	
	protected abstract void buildShape();
	
	public CompositeShape(Graphics g) {
		// TODO Auto-generated constructor stub
		this.g=g;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		buildShape();
		for(IShape iterator : shape) {
			iterator.draw();
		}
	}
	
}
