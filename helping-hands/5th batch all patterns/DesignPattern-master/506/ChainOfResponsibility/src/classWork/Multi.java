package classWork;

public class Multi extends COR{

	public Multi() {
		nextCor = new Div();
	}
	
	@Override
	public int calculate(int a, int b, int op) {
		if(op == 3) {
			return a * b;
		}
		if(nextCor != null) return nextCor.calculate(a, b, op);
		
		
		return -0;
	}

}
