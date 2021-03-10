package allShapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.ArrayList;

public abstract class CompositShape implements IShap {

	protected ArrayList<IShap> shapes;

	public CompositShape() {
		shapes = new ArrayList<>();
	}

	@Override
	public void drow() {

		buildShap();

		for (IShap shap : shapes)
			shap.drow();
	}

	public void drow(Graphics2D graphics) {
		buildShap(graphics);
		for (IShap shap : shapes)
			shap.drow(graphics);
	}

	public abstract void buildShap();

	public abstract void buildShap(Graphics2D graphics);
}
