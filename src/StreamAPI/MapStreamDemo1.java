package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class MapStreamDemo1 {

	public static void main(String[] args) {
		   Employee e1 = new Employee(111, "Juber", 90000D); 
		   Employee e2 = new Employee(222, "Aryan", 40000D); 
		   Employee e3 = new Employee(333, "Scott", 60000D); 
		   Employee e4 = new Employee(444, "Rahul", 70000D); 
		   Employee e5 = new Employee(555, "Aakash",85000D); 
		   Employee e6 = new Employee(666, "Manav", 92000D); 
		   Employee e7 = new Employee(666, "Manav", 92000D); 
		   
		   List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		   
		   System.out.println("View Employees: ");
		   emp.stream().map(e -> e.name()).forEach(System.out::println);
		   
		   
		   Double sal = emp.stream().mapToDouble(e -> e.salary()).sum();
		   System.out.println("The total cost of the company for all the Employees :"+sal);
		   
		
		   
	}

}
