package SEPT_21;

import java.util.*;

public class Employee {
	private int empId; private String empName; private double empSal;


	public Employee(int empId, String empName, double empSal) {
	
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public static Employee getEmployeeObject() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Emp Id: ");
		int empId = sc.nextInt();sc.nextLine();
		
		System.out.println("Enter Emp name: ");
		String empName = sc.nextLine();
		
		System.out.println("Enter emp salary: ");
		double empSal = sc.nextDouble();sc.nextLine();
		
		return new Employee(empId,empName,empSal);
	
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
