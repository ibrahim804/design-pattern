package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IA ia = new A();
		
		
		IA proxy = new ProxyA(ia);
		proxy.f1();
		
		
		
		
		
	}

}
