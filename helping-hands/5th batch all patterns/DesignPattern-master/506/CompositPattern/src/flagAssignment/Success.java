package flagAssignment;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Success extends JFrame{

    public Success(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(450,450);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(100, 100, 250, 260);
        g2.draw(lin);
        g2.fillOval(100, 100, 100, 100);
        
        g2.setColor(Color.red);
        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 100, 100);
        g2.fill(circle);
        
        
    }

    public static void main(String []args){
        Success s=new Success();
        s.setVisible(true);
    }
}
