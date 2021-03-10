package classWork;

public class Add extends COR{

	
	
	public Add() {
		nextCor = new Sub();
	}
	
	@Override
	public int calculate(int a, int b, int op) {
		if(op == 1) {
			return a - b;
		}
		if(nextCor != null) return nextCor.calculate(a, b, op);
		
		
		return -0;
	}

}
