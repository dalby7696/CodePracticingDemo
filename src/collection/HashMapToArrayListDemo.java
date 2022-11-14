package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayListDemo {
	public static void main(String[] args) {
        // Creating a HashMap object
        Map<String, String> mapTest = new HashMap<String, String>();
 
        // Adding elements to HashMap
        mapTest.put("John Kevin", "Average");
        mapTest.put("Rakesh Sharma", "Good");
        mapTest.put("Prachi D", "Very Good");
        mapTest.put("Ivan Jose", "Very Bad");
        mapTest.put("Smith Jacob", "Very Good");
        mapTest.put("Anjali N", "Bad");
 
        // Getting Set of keys
        Set<String> keySet = mapTest.keySet();
 
        // Creating an ArrayList of keys
        List<String> listOfKeys = new ArrayList<String>(keySet);
 
        System.out.println("ArrayList Of Keys :");
        for (String key : listOfKeys) {
            System.out.println(key);
        }
 
        System.out.println("--------------------------");
 
        // Getting Collection of values
        Collection<String> values = mapTest.values();
 
        // Creating an ArrayList of values
        List<String> listOfValues = new ArrayList<String>(values);
 
        System.out.println("ArrayList Of Values :");
        for (String value : listOfValues) {
            System.out.println(value);
        }
 
        System.out.println("--------------------------");
 
        // Getting the Set of entries
        Set<Entry<String, String>> entrySet = mapTest.entrySet();
 
        // Creating an ArrayList Of Entry objects
        List<Entry<String, String>> listOfEntry = new ArrayList<Entry<String, String>>(entrySet);
        System.out.println("ArrayList of Key-Values :");
        for (Entry<String, String> entry : listOfEntry) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
