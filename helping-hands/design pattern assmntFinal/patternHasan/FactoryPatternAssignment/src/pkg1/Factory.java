package pkg1;

import allFactory.AbstractFactory;
import allFactory.DatabaseFactory;
import allFactory.DesignPatternFactory;
import allFactory.WebTechnologyFactory;

public class Factory {
	public AbstractFactory provideTC(String choice) {
		AbstractFactory af=null;
		if(choice.equals("DP")) {
			af=new DesignPatternFactory();
		}
		else if(choice.equals("WT")) {
			af=new WebTechnologyFactory();
		}
		else if(choice.equals("DB")) {
			af=new DatabaseFactory();
		}
		return af;
	}
}
