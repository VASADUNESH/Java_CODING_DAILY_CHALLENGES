package SEPT_26;

public class TaxCalculation {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Dunesh", 60000, 10000, 10000);
		System.out.println(e1+"\nGross Salary: "+e1.calculateGrossSalary());
		TaxUtil tax = new TaxUtil();
		System.out.println("TAX for Employee: "+tax.calculateTax(e1));
		
		Manager m1 = new Manager(11, "Siri", 80000, 10000, 10000,20000);
		System.out.println("\n"+m1+"\nGross Salary: "+m1.calculateGrossSalary());
		System.out.println("TAX for Manger: "+tax.calculateTax(m1));
		
		Trainer t1 = new Trainer(101, 37, "Ravi", 90000, 10000, 1000, 1000);
		System.out.println("\n"+t1+"\nGross Salary: "+t1.calculateGrossSalary());
		System.out.println("TAX for Trainer: "+tax.calculateTax(t1));
		
		Sourcing s1 = new Sourcing(1001, 50, 40, "Satish", 20000, 1000, 1000, 1000);
		System.out.println("\n"+s1+"\nGross Salary: "+e1.calculateGrossSalary());
		System.out.println("TAX for Sourcing: "+tax.calculateTax(s1));
		
	}

}
/*
 The payroll system of an organization involves calculating the gross salary of each type of employee and the tax applicable to each. 

Note : Take parameterized constructor to initialize all fields. 

Create the following BLC classes as described below.

Class Employee
Fields: employeeId: int, employeeName : String, basicSalary : double, HRAPer : double, DAPer : double

Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer

Class Manager
Fields: managerId: int, managerName : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double

public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

Class Trainer
Fields: trainerId: int, trainerName : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double

public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)

Class Sourcing
Fields: sourceId: int, sourcaName : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double

Public Method: calculateGrossSalary() - returns a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)


Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee e) - returns a double
calculateTax(Manager m) - returns a double
calculateTax(Trainer t) - returns a double
calculateTax(Sourcing s) - returns a double

Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%.

An ELC class TaxCalculation is given to you with the main Method. Use this class to test your solution.
*/
