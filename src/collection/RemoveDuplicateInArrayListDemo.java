package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateInArrayListDemo {
	
	public static void main(String[] args) {
	//RemoveDuplicateInArrayList using Distinct method
       List<String> list= new ArrayList<>();
       
       list.add("Lundi");
       list.add("Mardi");
       list.add("Mercredi");
       list.add("Jeudi");
       list.add("Vendredi");
       list.add("Samedi");
       list.add("Dimanche");
       list.add("Lundi");
       
       
      // List<String> listWithoutDuplicatelements =list.stream().distinct().collect(Collectors.toList());
       //System.out.println(listWithoutDuplicatelements);
       
     //RemoveDuplicateInArrayList using removeif()
       
       Set<String> set = new LinkedHashSet<>();
       list.removeIf(s -> !set.add(s));
       System.out.println(set);
    }

}
