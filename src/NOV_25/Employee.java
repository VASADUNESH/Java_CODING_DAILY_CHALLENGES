package NOV_25;

public class Employee {
	
	private String employeeName, nationality;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String employeeName, String nationality, double salary) {
		super();
		this.employeeName = employeeName;
		this.nationality = nationality;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}	
}

class Messages{
	// final var's  => return msg
	public static final String COUNTRY_NOT_VALID = "Country invalid";
	public static final String NAME_NOT_VALID = "Name invalid";
	public static final String TAX_NOT_ELGIBLE = "Tax Not Elgible";
}

class CountryNotValidException extends Exception{

	public CountryNotValidException(String message) {
		super(message);
	}
	
}
class NameNotValidException extends Exception{

	public NameNotValidException(String message) {
		super(message);
	}
	
}
class NotEligibleForTaxException extends Exception{

	public NotEligibleForTaxException(String message) {
		super(message);
	}
	
}

class TaxCalculator{
	public double calculateTax(Employee emp) throws CountryNotValidException, NameNotValidException, NotEligibleForTaxException{
		
		if(!emp.getNationality().toLowerCase().equals("indian"))
			throw new CountryNotValidException("Country valid");
		
		if(emp.getEmployeeName().trim().isEmpty() || emp.getEmployeeName()==null)
			throw new NameNotValidException("Name is not valid");
		
		double salary = emp.getSalary();
		double tax=0;
		if(salary < 100000)
			throw new NotEligibleForTaxException("Not Eligible For Tax");
		else if (salary>=100000)
			return salary * 0.08;
		else if (salary>=50000)
			return salary * 0.06;
		else if (salary>=30000)
			return salary * 0.05;
		else if (salary>=10000)
			return salary * 0.04;
				
		return tax;
	}
}

class TaxSimulator{
	
}
























/*
Que-1
_______________________
Exceptions are thrown from a program when unexpected data/errors occur such that the program cannot proceed further logically. In the classes below, use different exception handling try/catch blocks to handle exceptions that occur while calculating the total tax value.

Employee class is given to you. The attributes of the Employee employeeName, nationality and salary are defined. The getters/setters are defined.A default Constructor and parameterized constructor are also defined.

Messages class is geven to you with pre-defined final variables. Please use these from the given class while returning messages.

Three classes are given to you. You must extend these classes with Exception class. And in each class you must define an additional constructor that takes one String message as an argument and initialized its super class with that string.

CountryNotValidException Class
NameNotValidException Class
NotEligibleForTaxException Class

A class TaxCalculator is given to you. In this class define the following method:

Method: calculateTax(Employee emp): This method should calculate the tax that should be levied on the employee and return that amount as a double. It has to be declared with throws clause with all applicable exceptions.

The tax calculation should be done using the following rules:

If the nationality of the employee is not "Indian" , throw a COJ_35_CountryNotValidException with a suitable message from MessageClass.

If the employee's name is not valid (null or empty) then throw a COJ_35_NameNotValidException with a suitable message from MessageClass

If the salary is more than or equals to 100000 (1 Lakh) then calculate tax as (salary * 8/100)

If the salary is more than or equals to 50000, but less than 100000 then calculate tax as (salary * 6/100)


If the salary is more than or equals to 30000, but less than 50000 then calculate tax as (salary * 5/100)


If the salary is more than or equals to 10000, but less than 30000 then calculate tax as (salary * 4/100)


If the salary is less than 10000 then throw a NotEligibleForTaxException with a suitable message from MessageClass


A Class TaxSimulator is given to you with a default constructor.In this class define a method:
*/