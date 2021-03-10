package pkg1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class WritingPanel extends JPanel {
	
	//JLabel letter[]=new JLabel[1000];
	JButton button;
	FWShorbornoFactory fwsFactory;
	Color colors[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.BLACK};
	String names[]= {"sherif","tahoma","courier","helvetica"};
	Character c;
	int index;
	
	DrawingPanel dp;
	
	public WritingPanel() {
		fwsFactory=new FWShorbornoFactory();
		//setBackground(Color.GRAY);	
		//setLayout(new GridLayout(5,1));
		//JPanel p1=new JPanel();
		setBackground(Color.CYAN);
		JLabel label=new JLabel("Write here in bangla");		
		add(label);
		JTextField textField=new JTextField("", 45);
		add(textField);
		button=new JButton("চাপুন");
		add(button);
		
		//JPanel p2=new JPanel();
		
		
	/*	for(int i=0;i<100;i++) {
			letter[i]=new JLabel();
			p2.add(letter[i]);
		}
	*/
		//add(p2);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				dp.index=0;
				dp.freeLabel();
				for(int i=0;i<text.length();i++) {
				    c=text.charAt(i);
					//System.out.println(c);
					if(c!=' ') {
							
						FWShorborno fws=fwsFactory.getFWShorborno(c);
						Color color=colors[(int)(Math.random()*5)];
						int fontSize=(int) (Math.random()*100+20); 
						String fontName=names[(int) (Math.random()*4)];
						System.out.println(color+" "+fontSize+" "+fontName);
						
						fws.setExtrinsic(fontName,color,fontSize);
						dp.draw(fws);
					
					}
					else System.out.println("space");
					
					
					
				}
				
			}
		});
		
	}
	public void setDrawingPanel(DrawingPanel dp) {
		this.dp=dp;
	}
	
}
