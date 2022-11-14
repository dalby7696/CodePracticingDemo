package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicateInArrayListDemo2 {
	
	public static void main(String[] args) {
		
		List<Employee> employeeWithDuplicateValue= new ArrayList<>();
		employeeWithDuplicateValue.add(new Employee("AUGUSTE", "1@gmail.com"));
		employeeWithDuplicateValue.add(new Employee("Dalby", "2@gmail.com"));
		employeeWithDuplicateValue.add(new Employee("Delicien", "3@gmail.com"));
		employeeWithDuplicateValue.add(new Employee("Dieula", "4@gmail.com"));
		employeeWithDuplicateValue.add(new Employee("Enock", "5@gmail.com"));
		employeeWithDuplicateValue.add(new Employee("Enock", "5@gmail.com"));
		employeeWithDuplicateValue.add(new Employee("AUGUSTE", "1@gmail.com"));
		
		Set<Employee> employeeWithoutDuplicateValue= employeeWithDuplicateValue
				.stream().collect(Collectors.toCollection(()-> new TreeSet<>(Comparator.comparing(Employee::getEmail))));
				
		employeeWithoutDuplicateValue.forEach(e -> System.out.println(e));
	
    }

}

class Employee {
    private String name;
    private String email;
 
    public Employee(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }
 
    public String getName() {
        return name;
    }
 
    public String getEmail() {
        return email;
    }
 
    @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + "]";
    }
}