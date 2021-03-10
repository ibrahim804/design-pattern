package pkg1;

import java.util.HashMap;

public class FWShorbornoFactory {
	HashMap<Character, FWShorborno> map=new HashMap<>();
	
	public FWShorborno getFWShorborno(Character letter) {
		if(!map.containsKey(letter)) {
			map.put(letter, new FWShorborno(letter));
		}
		return map.get(letter);
	}
}
