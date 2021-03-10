package AssignmentInterfaces;

import java.util.ArrayList;

import command.TransformCommand;
import receiver.ReceiverCircle;

public interface ICommandProcedurerMethods {
	public void proceedCommand(ArrayList<TransformCommand> commandList, ReceiverCircle circle);
}
