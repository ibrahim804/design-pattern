package factory;

import java.util.HashMap;
import java.util.Map;

import circle.FlyWeightCircle;

public class CircleFactory {
	private Map<Integer, FlyWeightCircle> circleMap;
	
	
	public CircleFactory() {
		circleMap = new HashMap<>();
	}
	
	public FlyWeightCircle getCircle(int color) {
		if(circleMap.get(color) == null) {
			FlyWeightCircle circle = new FlyWeightCircle(color); 
			circleMap.put(color, circle);
			return circle;
		}
		return circleMap.get(color);
	}
}
