package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Lundi");
		map.put(2, "Mardi");
		map.put(3, "Mercredi");
		map.put(4, "Jeudi");
		map.put(5, "Vendredi");
		
		for(Integer key : map.keySet()) {
			String value= map.get(key);
			System.out.println(key+" "+ value);
		}
		
		
		for(Entry<Integer, String> entry: map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" -> "+ value);
		}
	}

}
