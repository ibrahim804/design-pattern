package Assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Sentance {
	private String words;
	public Sentance(String words) {
		this.words = words;
	}
	
	public void viewSentence(int size, String fontName, Color borderColor, Color fontColor) {
		JFrame frame = new JFrame();
	    frame.setLayout(new GridBagLayout());
	    JPanel panel = new JPanel();
	    JLabel jlabel = new JLabel(words);
	    jlabel.setForeground(fontColor);
	    jlabel.setFont(new Font("SutonnyMJ",Font.PLAIN,16));
	    panel.add(jlabel);
	    panel.setBorder((Border) new LineBorder(borderColor)); // make it easy to see
	    frame.add(panel, new GridBagConstraints());
	    frame.setSize(400, 400);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
}
