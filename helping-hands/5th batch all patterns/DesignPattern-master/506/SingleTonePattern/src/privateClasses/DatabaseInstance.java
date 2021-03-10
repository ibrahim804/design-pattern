package privateClasses;

public class DatabaseInstance {

	private static DatabaseInstance databaseInstance;
	private DatabaseInstance(){};
	
	public static DatabaseInstance getDatabaseInstance() {
		if(databaseInstance == null) {
			synchronized (DatabaseInstance.class) {
				if(databaseInstance == null) {
					databaseInstance = new DatabaseInstance();
				}
				return databaseInstance;
			}
		}
		return databaseInstance;
	}
	
	public void testDataBase(){
		System.out.println("got it");
	}	
}
