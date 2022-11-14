package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	// Main driver method
    public static void main(String[] args)
    {
         
        Set<String> hash_Set = new HashSet<String>();
 
         
        hash_Set.add("Janvier");
        hash_Set.add("Fevrier");
        hash_Set.add("Mars");
        hash_Set.add("Avril");
        hash_Set.add("Janvier");
 
         
        System.out.println(hash_Set);
    }

}
