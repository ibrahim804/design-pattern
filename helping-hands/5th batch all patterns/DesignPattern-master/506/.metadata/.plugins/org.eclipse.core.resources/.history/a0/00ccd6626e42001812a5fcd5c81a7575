package command;

import interfaces.ICommand;
import receiver.ReceiverCircle;

public class TransformCommand implements ICommand{

	private ReceiverCircle circle;
	private int x, y;
	private int oldX, oldY;
	
	public TransformCommand(ReceiverCircle circle, int x, int y) {
		this.x = x;
		this.y = y;
		this.circle = circle;
		oldX = circle.getCircleX();
		oldY = circle.getCircleY();
	}
	
	@Override
	public void execute() {
		oldX = circle.getCircleX();
		oldY = circle.getCircleY();
		circle.transform(x, y);
		
	}

	@Override
	public void undo() {
		circle.transform(oldX, oldY);		
	}

}
