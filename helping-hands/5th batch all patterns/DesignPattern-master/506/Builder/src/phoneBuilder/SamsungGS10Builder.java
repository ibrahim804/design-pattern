package phoneBuilder;

import Phone.Phone;
import interfaces.PhoneBuilder;

public class SamsungGS10Builder implements PhoneBuilder {

	private Phone samsungGS10;

	public SamsungGS10Builder() {
		samsungGS10 = new Phone();
	}

	@Override
	public void buildDimension() {
		samsungGS10.setDimension(6.0);

	}

	@Override
	public void buildRam() {
		samsungGS10.setRam(16);
	}

	@Override
	public void buildOS() {
		samsungGS10.setOS("android");
	}

	@Override
	public void buildCamera() {
		samsungGS10.setCamera(20);
	}

	@Override
	public void buildBatery() {
		samsungGS10.setBatery(3000);
	}

	@Override
	public void buildProcessor() {
		samsungGS10.setProcessor(2.3);

	}

	@Override
	public void buildCpu() {
		samsungGS10.setCpu(1.6);

	}

	@Override
	public Phone getPhone() {
		samsungGS10.setDimension(6.0);
		samsungGS10.setRam(16);
		samsungGS10.setOS("android");
		samsungGS10.setCamera(20);
		samsungGS10.setBatery(3000);
		samsungGS10.setProcessor(2.3);
		samsungGS10.setCpu(1.6);

		return samsungGS10;
	}

}
