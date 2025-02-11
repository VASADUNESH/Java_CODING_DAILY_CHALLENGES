package DEC_17;
import java.util.*;
/**
 * 
 program-1
Employee Directory:
Develop an employee directory that stores employee information (name, position, salary) and allows CRUD operations using collections.

Employee Class:
This class represents an employee with attributes like name, position, and salary.
It has a constructor to initialize an employee's details and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.

Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.

EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.
 */
class Employee{
	private String name,position;
	private int salary;
	public Employee(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
}
class Directory{
	private ArrayList<Employee> employees;

	public Directory() {
		super();
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
		System.out.println("Employee added");
	}
	public void displayAllEmployee() {
		for(Employee empp : employees) {
			System.out.println(empp);
		}
	}
	public void updateEmployee(int index, String name, String position, int salary) {
		if(index>=0 && index<employees.size()) {
			Employee emp = employees.get(index);
			emp.setName(name);emp.setPosition(position);emp.setSalary(salary);
		}
		else {
			System.out.println("Employee not found");
		}
	}
	public void deleteEmployee(int index) {
		if(index>=0 && index<employees.size()) {
			employees.remove(index);
		}
		else {
			System.out.println("Employee not found");
		}
	}
	
}

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		
		Employee alice = new Employee("Alice","Manager",6000);
		Employee bob = new Employee("Bob","Developer",50000);
		
		Directory directory = new Directory();
		directory.addEmployee(alice);
		directory.addEmployee(bob);
		
		System.out.println("Display All the employees:");
		directory.displayAllEmployee();
		
		directory.updateEmployee(1, "King", "Senior", 9999);
		
		System.out.println("Display All the employees:");
		directory.displayAllEmployee();
		
		System.out.println("Removing emp");
		directory.deleteEmployee(0);
		
		System.out.println("Final Display All the employees:");
		directory.displayAllEmployee();
		
	}

}
