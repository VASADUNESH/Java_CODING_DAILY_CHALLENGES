package SEPT_21;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees : ");
		int n = sc.nextInt();sc.nextLine();
		
		for (int i=1;i<=n;i++) {
			Employee e1 =  Employee.getEmployeeObject();
			System.out.println(e1);
		}
		

	}

}
/*
 * 
 Question-1
--------------
Create a class Employee (Business Logic Class)

Instance Variables: 

employeeId   		:private-int

employeeName 	: private-String

employeeSalary	: private-double



Create a parameterized constructor to initialilize all the fields.

Methods :
Create a static method getEmployeeObject() in the Employee class

  Method Name 	 : getEmployeeObject()

   Parameter		 : no parameter

  Return type 		 : Employee

Access modifier 	 : public



getEmployeeObject() method of Employee class should take employeeId, employeeName, employeeSalary from the keyboard to initialize the instance variables, Create and return the Employee object from this method.



Override toString() from Object class to print Employee class properties.



Create another class Main which contains main method (ELC class).
Employee data initialisation using scanner class.
Accept 5 Employee Object from keyboard and print their data using toString() method 


Test Cases :
--------------
case-1
--------
Sample Input :
----------------
Enter details for Employee 1:
Enter Employee ID (positive integer): 101
Enter Employee Name (non-empty): Virat Kohli
Enter Employee Salary (non-negative): 50000

Expected Output :

Employee [ID: 101, Name: Virat Kohli, Salary: 50000.0]

case-2
--------
Sample Input :
-----------------
Enter details for Employee :2

Enter Employee ID (positive integer): -5
Invalid input. Employee ID must be a positive integer.

Enter Employee ID (positive integer): 102
Enter Employee Name (non-empty): M.S Dhoni
Enter Employee Salary (non-negative): 60000

Expected Output :
----------------------
Invalid input. Employee ID must be a positive integer.
Employee [ID: 102, Name:M.S Dhoni, Salary: 60000.0]*/
