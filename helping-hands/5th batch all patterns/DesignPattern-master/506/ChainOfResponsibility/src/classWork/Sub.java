package classWork;

public class Sub extends COR{

	public Sub() {
		nextCor = new Multi();
	}
	
	@Override
	public int calculate(int a, int b, int op) {
		if(op == 2) {
			return a - b;
		}
		if(nextCor != null) return nextCor.calculate(a, b, op);
		
		
		return -0;
	}

}
