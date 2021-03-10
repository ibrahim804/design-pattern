package pkg1;

public class FillColorCommand implements ICommand {
	String color;
	Circle circle;
	String oldColor;
	public FillColorCommand(Circle circle,String color) {
		this.circle=circle;
		this.color=color;
	}
	@Override
	public void execute() {
		oldColor=circle.color;
		circle.fillColor(color);
	}

	@Override
	public void undo() {
		circle.fillColor(oldColor);
	}
	@Override
	public void redo() {
		circle.fillColor(color);
	}

}
