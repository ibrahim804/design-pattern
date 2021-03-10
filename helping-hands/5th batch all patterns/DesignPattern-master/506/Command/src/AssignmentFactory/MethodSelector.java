package AssignmentFactory;

import java.util.HashMap;
import java.util.Map;

import AssignmentCommandSpliter.ChangeCommandMethod;
import AssignmentCommandSpliter.RedoCommandMethod;
import AssignmentCommandSpliter.UndoCommandMethod;
import AssignmentInterfaces.ICommandProcedurerMethods;

public class MethodSelector {
	
	private Map<String, ICommandProcedurerMethods> methodContainer;
	
	public MethodSelector() {
		methodContainer = new HashMap<>();
		initiate();
	}

	private void initiate() {
		methodContainer.put("redo", new RedoCommandMethod());
		methodContainer.put("undo", new UndoCommandMethod());
		methodContainer.put("update", new ChangeCommandMethod());
	}
	
	public ICommandProcedurerMethods getCommandMethod(String key) {
		return methodContainer.get(key);
	}
}
