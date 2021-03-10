package image;

public class ProxyImage {
	private RealImage image;
	
	public void provideImage(){
		if(image == null) 
			image = new RealImage();
		image.provideImage();
	}
}
