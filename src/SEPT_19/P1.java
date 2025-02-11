package SEPT_19;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Department: ");
		String dept = sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();sc.nextLine();
		
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();sc.nextLine();
		
		System.out.println("Enter Performance: ");
		String per = sc.nextLine();
		
		
		
		Employee e1 = new Employee(name, dept, per, sal, age);
		
		while(true) {
			System.out.println("\n1.Update Salary\n2.Performance\n3.Display Details\n4.EXIT");
			int choice = sc.nextInt(); sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter increment salary: ");
				double uSal = sc.nextDouble(); sc.nextLine();
				e1.updateSalary(uSal);
				break;
			case 2:
				System.out.println("Enter performance [good/avg]: ");
				String p = sc.nextLine(); 
				e1.performance(p);
				break;
			case 3:
				System.out.println(e1);
				break;
			case 4:
				System.out.println("Program terminated\nTHANK YOU");
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
		}
		
	}

}
/*
Question-1
-------------
You've been assigned the task of developing a Java program to manage employee information and salary updates based on performance evaluations.

Employee Class:[BLC Class]
-------------------
Create an Employee class with the following 
Attributes:
--------------
Names			dataType
---------		-----------
name                    String
age                     int 
department              String
salary                  double 
performance 		String

Implement a constructor that takes parameters to initialize the attributes of the Employee object.

Update Salary Method:

Method:
-------------
MethodName  		:updateSalary()
Return Type		:double
Access Modifier 	:public

Implement a method named updateSalary within the Employee class. This method should update the salary based on the employee's performance evaluation.

notes:
If the performance is "good", add a bonus of ?10,000 to  the salary.
If the performance is "average", add a bonus of ?5,000 to the salary.
If the performance is null, no bonus is added.

Create a EmployeeTester class [ELC Class]
In the main method:
Create at least three Employee objects with different performance evaluations.
Call the updateSalary method for each employee.
Print the updated salaries of all employees.

Test Cases :
---------------
case-1
---------
Name: shaktiman
Age: 30
Department: Sales
Salary: 50000
Performance: good

Expected Output :
valid input (print all the above details)

case-2
--------
Sample Input :

Name: Gangadhar
Age: -25
Department: HR
Salary: 47000
Performance: good

Expected Output :
Invalid input. Age must be a positive integer.*/