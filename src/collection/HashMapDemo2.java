package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Student st1 = new Student(1, "AUGUSTE Delicien");
		Student st2 = new Student(2, "AUGUSTE Enock");
		Student st3 = new Student(3, "AUGUSTE Davidson");
		Student st4 = new Student(4, "Dieula Borgella");
		
		
		
		Map<Integer, Student> map = new HashMap<>();
		map.put(st1.getId(), st1);
		map.put(st2.getId(), st2);
		map.put(st3.getId(), st3);
		map.put(st4.getId(), st4);
		
		
		for(Entry<Integer, Student> entry: map.entrySet()) {
			Integer key = entry.getKey();
			Student value= entry.getValue();
			
			System.out.println(key+" => "+value);
		}
		
		
	}

}
class Student {
    private int id;
    private String name;
 
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
}