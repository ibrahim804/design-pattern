package AssignmentCommandSpliter;

import java.util.ArrayList;

import AssignmentInterfaces.ICommandProcedurerMethods;
import command.TransformCommand;
import receiver.ReceiverCircle;

public class UndoCommandMethod implements ICommandProcedurerMethods{

	@Override
	public void proceedCommand(ArrayList<TransformCommand> commandList, ReceiverCircle circle) {
		if(commandList.size()> 0)
			commandList.get(commandList.size()-1).undo();
		System.out.println("New x of circle is :> " + circle.getCircleX());
		System.out.println("New y of circle is :> " + circle.getCircleY());
		
	}

}
