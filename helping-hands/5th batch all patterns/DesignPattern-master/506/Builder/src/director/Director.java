package director;

import java.util.HashMap;
import java.util.Map;

import Phone.Phone;
import interfaces.PhoneBuilder;
import phoneBuilder.SamsungGS10Builder;

public class Director {

	private Map<String, PhoneBuilder> phoneBuilders;
	
	public Director() {
		phoneBuilders = new HashMap<>();
		init();
	}
	
	private void init() {
		phoneBuilders.put("SamsungGS10", new SamsungGS10Builder());
	}

	public Phone getPhone(String phoneName) {
		return phoneBuilders.get(phoneName).getPhone();
	}
}
