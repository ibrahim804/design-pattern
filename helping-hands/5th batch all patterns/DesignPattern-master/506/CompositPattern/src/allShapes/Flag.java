package allShapes;

import java.awt.Graphics;
import java.awt.Graphics2D;


public class Flag extends CompositShape{

	@Override
	public void buildShap() {
		shapes.add(new Rectangle());
		shapes.add(new Circle(new Point(5, 5), 10));
	}


	public void buildShap(Graphics2D graphics) {
		shapes.add(new Rectangle(new Point(100, 100), new Point(400, 300)));
		shapes.add(new Circle(new Point(170, 150), 100));
	}


	@Override
	public IShap copy() {
		try {
			return (IShap)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
