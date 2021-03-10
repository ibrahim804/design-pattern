package pkg1;

import java.awt.Color;

public class FWShorborno {
	char letter;
	String fontName;
	Color color;
	int fontSize;
	public FWShorborno(char letter) {
		this.letter=letter;
	}
	public void setExtrinsic(String fontName,Color color,int fontSize) {
		this.fontName=fontName;
		this.color=color;
		this.fontSize=fontSize;
	}
}
