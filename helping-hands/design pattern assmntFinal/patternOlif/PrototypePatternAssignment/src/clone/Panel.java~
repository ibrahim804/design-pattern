package clone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{

	private static final long serialVersionUID = 1L;
	ArrayList<Circle> circles = new ArrayList<>();
	private int selectedCircle = -1;
	private Circle clonedCircle = null;
	public Panel() {
		super();
		setLayout(null);
		makeCloneButton();
		makeRithShiftButton();
		makeLeftShiftButton();
		makeUpShiftButton();
		makeDownShiftButton();
		makeChoserButton();
		makeFinishButton();
		addMouseListener(this);
		
		Circle circle = new Circle(600, 300, 45,Color.getColor("black"));
		circles.add(circle);
		repaint();
	}
	
	
	private void makeDownShiftButton() {
		JButton editButton = new JButton("Down+10");
		editButton.setBounds(300,50,100,40);
		editButton.setFocusPainted(false);
		editButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedCircle == -1) JOptionPane.showMessageDialog(null, "Circle Not selected");
				else{
					clonedCircle.setY(clonedCircle.getY()+10);
					repaint();
				}
				
			}
		});
		add(editButton);
	}

	private void makeUpShiftButton() {
		JButton editButton = new JButton("Up+10");
		editButton.setBounds(450,50,100,40);
		editButton.setFocusPainted(false);
		editButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(selectedCircle == -1) JOptionPane.showMessageDialog(null, "Circle Not selected");
				else{
					clonedCircle.setY(clonedCircle.getY()-10);
					repaint();
				}
				
			}
		});
		add(editButton);
		
	}

	private void makeLeftShiftButton() {
		JButton editButton = new JButton("Left+10");
		editButton.setBounds(600,50,100,40);
		editButton.setFocusPainted(false);
		editButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(selectedCircle == -1) JOptionPane.showMessageDialog(null, "Circle Not selected");
				else{
					clonedCircle.setX(clonedCircle.getX()-10);
					repaint();
				}
				
			}
		});
		add(editButton);
	}

	private void makeRithShiftButton() {
		JButton editButton = new JButton("Right+10");
		editButton.setBounds(750,50,100,40);
		editButton.setFocusPainted(false);
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedCircle == -1) JOptionPane.showMessageDialog(null, "Circle Not selected");
				else{
					clonedCircle.setX(clonedCircle.getX()+10);
					repaint();
				}
			}
		});
		add(editButton);
	}
	
	
	
	private void makeChoserButton() {
		JButton editButton = new JButton("Choose Color");
		editButton.setBounds(900,50,120,40);
		editButton.setFocusPainted(false);
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedCircle == -1) JOptionPane.showMessageDialog(null, "Circle Not selected");
				else{
					Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.BLACK);
					clonedCircle.setColor(newColor);
					repaint();
				}
			}
		});
		add(editButton);
	}
	
	
	private void makeFinishButton() {
		JButton editButton = new JButton("Finish");
		editButton.setBounds(1050,50,100,40);
		editButton.setFocusPainted(false);
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedCircle = -1;
			}
		});
		add(editButton);
	}

	private void makeCloneButton() {
		JButton cloneButton = new JButton("Clone");
		cloneButton.setBounds(150,50,100,40);
		cloneButton.setFocusPainted(false);
		cloneButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedCircle == -1) JOptionPane.showMessageDialog(null, "Circle Not selected");
				else{
					try {
						clonedCircle = (Circle) circles.get(selectedCircle).clone();
						circles.add(clonedCircle);
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}
					
					repaint();
				}
				
			}
		});
		add(cloneButton);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		for(int i=0;i<circles.size();i++){
			g2d.setColor(circles.get(i).getColor());
			g2d.fillOval(circles.get(i).getX(), circles.get(i).getY(),
					circles.get(i).getRadius()*2, circles.get(i).getRadius()*2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		identifyCircle(x, y);
		
	}

	private void identifyCircle(int x, int y) {
		for(int i =0;i<circles.size();i++){
			int x1 = circles.get(i).getX();
			int y1 = circles.get(i).getY();
			int radius = circles.get(i).getRadius();
			if((x-x1) <= radius*2 && (x-x1)>= 0 && (y-y1) <= radius*2 && (y-y1)>= 0){
				this.selectedCircle = i;
				System.out.println("Circle selected");
				JOptionPane.showMessageDialog(null, "Circle selected");
				break;
			}
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
