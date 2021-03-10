package factory;

public class StealFactory implements IFactory{

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new StealRoom();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new StealWindow();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new StealDoor();
	}
	
}
