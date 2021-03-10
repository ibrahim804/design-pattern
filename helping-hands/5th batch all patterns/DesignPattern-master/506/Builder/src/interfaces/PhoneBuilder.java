package interfaces;

import Phone.Phone;

public interface PhoneBuilder {
	public void buildDimension();
	public void buildRam();
	public void buildOS();
	public void buildCamera();
	public void buildBatery();
	public void buildProcessor();
	public void buildCpu();
	public Phone getPhone();
}
