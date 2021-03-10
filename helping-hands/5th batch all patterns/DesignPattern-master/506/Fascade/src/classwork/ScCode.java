package classwork;

public class ScCode {
	private int code;
	
	public ScCode() {
		this.code = 11111;
	}
	
	public boolean checkCode(int code) {
		if(this.code == code) return true;
		else return false;
	}
}
