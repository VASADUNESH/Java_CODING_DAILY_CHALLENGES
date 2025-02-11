package SEPT_20;

public class Employee {
	private int empNumber; private String empName; private double empSal;


	public Employee(int empNumber, String empName, double empSal) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.empSal = empSal;
	}


	public int getEmpNumber() {
		return empNumber;
	}


	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
}
