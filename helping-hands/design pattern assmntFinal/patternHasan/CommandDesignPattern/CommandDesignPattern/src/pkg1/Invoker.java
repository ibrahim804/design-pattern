package pkg1;

public class Invoker {
	
	void execute(ICommand iCommand) {
		iCommand.execute();
	}
	void undo(ICommand iCommand) {
		iCommand.undo();
	}
}
