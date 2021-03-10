package flagAssignment;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import allShapes.Circle;
import allShapes.Flag;
import allShapes.Line;
import allShapes.Point;

//import com.sun.prism.Graphics;

public class Window extends JFrame {

	public Window() {
		JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(450,450);
	}

	public void paint(Graphics graphics) {

		Graphics2D g2 = (Graphics2D) graphics;
		Flag flag = new Flag();
		flag.drow(g2);
        //Line2D lin = new Line2D.Float(100, 100, 400, 100);
        //g2.draw(lin);
        //lin = new Line2D.Float(100, 300, 400, 300);
        //g2.draw(lin);
        
		//Circle circle = new Circle(new Point(100, 100), 100);
		//circle.drow(g2);
        
        // g2.fillOval(100, 100, 100, 100);
		
		
        
		//drow(g2);
		
		//Line line = new Line(new Point(100, 100), new Point(400, 100));
		//line.drow(g2);
		
		
		
		//Flag flag = new Flag();
		 //flag.buildShap(graphics);;
		 //flag.drow(graphics);

		// new Flag(getRectangleCooRdinate(), new Point(130, 120),
		// 20).buildShape(g);

	}

	private void drow(Graphics2D g2) {
		Line2D lin = new Line2D.Float(100, 100, 400, 100);
        g2.draw(lin);
		
	}

}
