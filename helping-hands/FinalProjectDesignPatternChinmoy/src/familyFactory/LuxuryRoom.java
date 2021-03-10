package familyFactory;

public class LuxuryRoom implements IRoomFactory {

	@Override
	public IWall createWall() {

		return new GlassWall();
	}

	@Override
	public IDoor createDoor() {

		return new SlidingDoor();
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
		
		
		return "Sea View, " + wall.toString() + ", " + door.toString() + ", " + window.toString();
	}

}
