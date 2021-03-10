package Phone;

import interfaces.PhonePlan;

public class Phone implements PhonePlan{

	private double dimension;
	private int ram;
	private String OS;
	private int camera;
	private int batery;
	private double processor;
	private double cpu;
	
	public Phone() {
		dimension = 5.5;
		ram = 4;
		OS = "android";
		camera = 13;
		batery = 2000;
		processor  = 1.3;
		cpu = 1.3;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}

	public int getBatery() {
		return batery;
	}

	public void setBatery(int batery) {
		this.batery = batery;
	}

	public double getProcessor() {
		return processor;
	}

	public void setProcessor(double processor) {
		this.processor = processor;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	
	
}
