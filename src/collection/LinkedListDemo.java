package collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> fruit= new LinkedList<>();
		
		
		
		
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Chery");
		fruit.add("Chery");
		
		
		
		//fruit.stream().filter(f-> f.startsWith("A")).forEach(System.out::println);
		fruit.forEach(f -> System.out.println(f));
		//System.out.println(fruit.get(0));
		
	}

}
