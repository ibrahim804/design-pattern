package test;

public class ProxyA implements IA{

	private IA ia;
	
	public ProxyA(IA ia) {
		this.ia = ia;
	}
	
	@Override
	public void f1() {
		System.out.println("calling f1");
		ia.f1();
		
	}

	@Override
	public void f2() {
		System.out.println("calling f2");
		ia.f2();
		
	}

	@Override
	public void f3() {
		System.out.println("calling f3");
		ia.f3();
		
	}

}
