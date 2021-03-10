package main;

public class Circle implements IShape {

	private int x, y, r;

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void draw() {
		System.out.println("Circle Draw at ("+x+","+y+","+r+")");
	}
	
}
