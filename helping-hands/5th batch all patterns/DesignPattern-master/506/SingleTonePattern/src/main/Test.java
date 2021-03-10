package main;

import privateClasses.DatabaseInstance;

public class Test {

	public static void main(String[] args) {
		
		DatabaseInstance databaseInstance = DatabaseInstance.getDatabaseInstance();
		databaseInstance.testDataBase();

	}

}
