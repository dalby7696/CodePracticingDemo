package collection;

import java.util.HashSet;

public class HashSetExampleDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Lundi");
		set.add("Mardi");
		set.add("Mercredi");
		set.add("Jeudi");
		set.add("Vendredi");
		set.add("Samedi");
		
		
	    //set.remove("Lundi");
		
		for(String s:set) {
			System.out.println(s);
		}

	}

}
