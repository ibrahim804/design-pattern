package all;

public abstract class ElectronicDevice {
	

	public abstract void rightButton();

	public abstract void leftButton(); 
	
	public void upButton() {
		System.out.println("volume up");
	}

	public void downButton() {
		System.out.println("volume down");
	}
	

}
