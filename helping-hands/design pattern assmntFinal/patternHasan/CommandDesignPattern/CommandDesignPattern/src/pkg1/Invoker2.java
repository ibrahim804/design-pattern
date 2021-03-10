package pkg1;

import java.util.ArrayList;

public class Invoker2 {
	ArrayList<ICommand> exCommands;
	ArrayList<ICommand> undoCommands;
	ArrayList<ICommand> redoCommands;
	public Invoker2() {
		exCommands=new ArrayList<>();
		undoCommands=new ArrayList<>();
		redoCommands=new ArrayList<>();
	}
	
	void addExecute(ICommand command){
		exCommands.add(command);
	}
	
	void addUndo(ICommand command) {
		undoCommands.add(command);
	}
	
	void addRedo(ICommand command) {
		redoCommands.add(command);
	}
	void execute() {
		for (ICommand iCommand : exCommands) {
			iCommand.execute();
		}
	}
	void undo() {
		for (ICommand iCommand : undoCommands) {
			iCommand.undo();
		}
	}
	void redo() {
		for (ICommand iCommand : redoCommands) {
			iCommand.redo();
		}
	}
}
