package familyFactory;

public class DeluxRoom implements IRoomFactory {
	
	
	@Override
	public IWall createWall() {

		return new WoodenWall();
	}

	@Override
	public IDoor createDoor() {

		return new SteelDoor();
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
		
		
		return wall.toString() + ", " + door.toString() + ", " + window.toString();
	}

}
