package pkg1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.WrappedPlainView;

public class Window extends JFrame {
	public Window() {
		setLayout(new BorderLayout());
		
		JPanel east=new JPanel();
		east.setBackground(Color.BLUE);
		add(east,BorderLayout.EAST);
		
		JPanel west=new JPanel();
		west.setBackground(Color.GREEN);
		add(west,BorderLayout.WEST);
		
	/*	JPanel north=new JPanel();
		north.setBackground(Color.RED);
		add(north,BorderLayout.NORTH);
	*/
		JPanel south=new JPanel();
		south.setBackground(Color.YELLOW);
		add(south,BorderLayout.SOUTH);
		
	/*	JPanel center=new JPanel();
		center.setBackground(Color.MAGENTA);
		center.setLayout(new GridLayout(3, 1));
	*/	
		
		WritingPanel topCenter=new WritingPanel();
		add(topCenter,BorderLayout.NORTH);
		
		DrawingPanel downCenter=new DrawingPanel();
		//add(downCenter,BorderLayout.CENTER);
		
		
		topCenter.setDrawingPanel(downCenter);
		
		
		JScrollPane scrollPane = new JScrollPane(downCenter);
		//scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 1250, 700);
		
		
		JPanel contentPane = new JPanel(null);
        contentPane.setBackground(Color.ORANGE);
        contentPane.setPreferredSize(new Dimension(1300, 700));
        contentPane.add(scrollPane);
        //setContentPane(contentPane);
        add(contentPane,BorderLayout.CENTER);
        pack();
		
		//setSize(1000, 800);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
		setLocationRelativeTo(null);
		
	}
}
