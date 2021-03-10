package all;

public class TV extends ElectronicDevice{

	@Override
	public void rightButton() {
		System.out.println("next channel");
		
	}

	@Override
	public void leftButton() {
		System.out.println("previous channel");
		
	}

}
