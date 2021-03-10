package pkg1;

public class ChangeRadiusCommand implements ICommand {
	Circle circle;
	double radius;
	double oldRadius;
	public ChangeRadiusCommand(Circle circle,double radius) {
		this.circle=circle;
		this.radius=radius;
	}
	@Override
	public void execute() {
		oldRadius=circle.radius;
		circle.changeRadius(radius);
	}

	@Override
	public void undo() {
		circle.changeRadius(oldRadius);
	}
	@Override
	public void redo() {
		circle.changeRadius(radius);
		
	}

}
