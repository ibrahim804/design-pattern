package pkg1;

public class Circle {
	double radius;
	int x,y;
	String color;
	
	public void transform(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void fillColor(String color) {
		this.color=color;
	}
	public void changeRadius(double radius) {
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
}
