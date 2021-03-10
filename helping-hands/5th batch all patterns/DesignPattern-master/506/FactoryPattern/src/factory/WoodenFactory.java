package factory;

public class WoodenFactory implements IFactory{

	@Override
	public IRoom createRoom() {
		return new WoodenRoom();
	}

	@Override
	public IWindow createWindow() {
		return new WoodenWindow();
		
	}

	@Override
	public IDoor createDoor() {
		return new WoodenDoor();
	}
	
	

}
