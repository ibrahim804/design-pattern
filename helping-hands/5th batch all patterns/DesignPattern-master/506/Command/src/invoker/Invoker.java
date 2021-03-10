package invoker;

import java.util.ArrayList;

import interfaces.ICommand;

public class Invoker {

	private ArrayList<ICommand> allCommand;
	
	
	public Invoker() {
		allCommand = new ArrayList<>();
	}
	
	public void addCommand(ICommand command) {
		allCommand.add(command);
	}
	
	
	public void executeAllCommand() {
		for(int i = 0; i < allCommand.size(); i++)
			allCommand.get(i).execute();
	}
	
	
	public void undoAllCommand() {
		for(int i = 0; i < allCommand.size(); i++)
			allCommand.get(i).undo();
	}
	
	
	
	
	
	
	
}
