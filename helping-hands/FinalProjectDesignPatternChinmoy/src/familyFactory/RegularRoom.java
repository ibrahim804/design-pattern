package familyFactory;

public class RegularRoom implements IRoomFactory{

	@Override
	public IWall createWall() {
		
		return new BrickWall();
	}

	@Override
	public IDoor createDoor() {
		
		return new WoodenDoor();
	}

	@Override
	public IWindow createWindow() {
		
		return new GlassWindow();
	}

	@Override
	public String roomDetails() {

		IWall wall = createWall();
		IDoor door = createDoor();
		IWindow window = createWindow();
		
		
		return  wall.toString() + ", " + door.toString() + ", " + window.toString();
	}

}
