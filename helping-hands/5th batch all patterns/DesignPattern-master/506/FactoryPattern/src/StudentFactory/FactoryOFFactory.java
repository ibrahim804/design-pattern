package StudentFactory;

import java.util.HashMap;
import java.util.Map;

public class FactoryOFFactory {
	private Map<Integer, Factory> factoryMap;
	
	public FactoryOFFactory() {
		init();
	}

	private void init() {
		factoryMap = new HashMap<>();
		factoryMap.put(501, new ParallelComputingFactory());
		factoryMap.put(502, new WebTechFactory());
		factoryMap.put(503, new BusinessCommunicationFactory());
		factoryMap.put(504, new DBMS2Factory());
		factoryMap.put(505, new SPL2Factory());
		factoryMap.put(506, new DesignPatternFactory());
	}
	
	public Factory getFactory(int courseNumber) {
		return factoryMap.get(courseNumber);
	}
}
