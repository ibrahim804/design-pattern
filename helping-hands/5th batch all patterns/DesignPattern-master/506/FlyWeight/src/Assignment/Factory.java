package Assignment;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import circle.FlyWeightCircle;

public class Factory {
	
	private Map<String, Color> colorMap;
	private Map<String, Sentance> sentanceMap;

	public Factory() {
		init();
	}

	private void init() {
		colorMap = new HashMap<>();
		colorMap.put("red", Color.red);
		colorMap.put("blue", Color.blue);
		colorMap.put("green", Color.green);
		colorMap.put("yellow", Color.yellow);
		colorMap.put("black", Color.black);
		
		sentanceMap = new HashMap<>();
		
	}
	
	public Color getColor(String color) {
		return colorMap.get(color);
	}
	
	
	public Sentance getSentance(String words) {
		if(sentanceMap.get(words) == null) {
			Sentance newSenteace= new Sentance(words); 
			sentanceMap.put(words, newSenteace);
			return newSenteace;
		}
		return sentanceMap.get(words);
	}
	
	

}
