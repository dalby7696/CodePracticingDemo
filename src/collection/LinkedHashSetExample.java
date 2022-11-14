package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Lundi");
		linkedHashSet.add("Vendredi");
		linkedHashSet.add("Mardi");
		linkedHashSet.add("Mercredi");
		linkedHashSet.add("Jeudi");
		linkedHashSet.add("Lundi");
		
		for(String s: linkedHashSet) {
			System.out.println(s);
		}

	}

}
