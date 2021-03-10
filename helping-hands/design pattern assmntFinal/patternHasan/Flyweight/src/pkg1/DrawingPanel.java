package pkg1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	JLabel letter[]=new JLabel[1000];
	int index;
	public DrawingPanel() {
		setBackground(Color.gray);
		for(int i=0;i<1000;i++) {
			letter[i]=new JLabel();
			add(letter[i]);
		}
	}
	public void draw(FWShorborno fws) {
		Character c=fws.letter;
		letter[index].setText(String.valueOf(c));
		letter[index].setFont(new Font(fws.fontName, Font.PLAIN, fws.fontSize));
		letter[index].setForeground(fws.color);
		index++;
	}
	public void freeLabel() {
		for(int i=0;i<1000;i++) {
			letter[i].setText("");
		}
	}
}
