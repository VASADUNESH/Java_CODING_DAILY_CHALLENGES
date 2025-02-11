package SEPT_20;

public class p3 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(7,"DK",600000);
		
		System.out.println(e1);
		
		e1.setEmpName("Dunesh");
		System.out.println(e1.getEmpName());
		
		e1.setEmpNumber(1);
		System.out.println(e1.getEmpNumber());
		
		e1.setEmpSal(900000);
		System.out.println(e1.getEmpSal());
		
		System.out.println(e1);

	}

}
/*
Program 03 :
------------
Create a class Employee (Business Logic Class)

 Instance Variables:
 employeeNumber : private-int
 employeeName : private-String
 employeeSalary:private -double 

 Create a parameterized constructor to initialilize all the fields.
 Create getters method for all the instance variables.

 Create another class Main which contains main method (ELC class) which will receive all the instance variable value from BLC class.

 In this ELC class print the following details

 a) If salary is >=60000, Print Employee is a Developer

 b) If salary is >=40000 and <60000 , Print Employee is a Designer

 c) If Salary is <40000 , Print Employee is a Tester

Input:

232, "Naresh", 43000



Output:
Employee is a Designer
*/