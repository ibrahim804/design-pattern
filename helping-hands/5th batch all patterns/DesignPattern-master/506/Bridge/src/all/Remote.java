package all;

public abstract class Remote{

	private ElectronicDevice electronicDevice;
	public Remote(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}
	
	
	
	public void upButton() {
		electronicDevice.upButton();
	}

	public void downButton() {
		electronicDevice.downButton();
	}
	
	public void rightButton() {
		electronicDevice.rightButton();
		
	}

	
	public void leftButton() {
		electronicDevice.leftButton();
	}
	
	public abstract void centerButton();

}
