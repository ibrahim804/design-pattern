package factory;

public class GlassFactory implements IFactory{

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new GlassRoom();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new GlassWindow();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new GlassDoor();
	}

}
