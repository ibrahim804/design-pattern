package pkg1;

public class TransformCommand implements ICommand{
	Circle circle;
	int x,y;
	int oldX,oldY;
	public TransformCommand(Circle circle,int x,int y) {
		this.circle=circle;
		this.x=x;
		this.y=y;
	}
	@Override
	public void execute() {
		oldX=circle.x;
		oldY=circle.y;
		circle.transform(x,y);
	}

	@Override
	public void undo() {
		circle.transform(oldX, oldY);
	}
	@Override
	public void redo() {
		circle.transform(x, y);
	}
	
}
