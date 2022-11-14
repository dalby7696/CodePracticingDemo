package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapDemo {
	public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Lundi");
        map.put(2, "Mardi");
        map.put(3, "Mercredi");
 
        // show map using method keySet()
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
 
        System.out.println("---");
 
        // show map using method keySet()
        for (Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }

}
