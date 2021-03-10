package all;

public class Test1 {
	public static void main(String[] args) {
		ElectronicDevice tv = new TV();
		
		PouseRemort pouseRemort = new PouseRemort(tv);
		
		pouseRemort.downButton();
		pouseRemort.centerButton();
		
		
	}
}
