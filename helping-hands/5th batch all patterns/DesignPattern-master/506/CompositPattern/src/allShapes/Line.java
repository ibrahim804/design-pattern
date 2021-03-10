package allShapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Line implements IShap {
	private Point start;
	private Point end;

	@Override
	public void drow() {
		System.out.println("drow a line start from (" + start.getxCoOrdinate() + ", " + start.getyCoOrdinate()
				+ ") to (" + end.getxCoOrdinate() + ", " + end.getyCoOrdinate() + ")");
	}

	@Override
	public void drow(Graphics2D graphics) {
		graphics.draw(new Line2D.Float(start.getxCoOrdinate(), start.getyCoOrdinate(), end.getxCoOrdinate(),
				end.getyCoOrdinate()));
	}

	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
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
