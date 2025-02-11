package SEPT_26;

public class Employee {
	private int empId; private String empName;
	private double basicSal,HRAPer, DAPer;
	public Employee(int empId, String empName, double basicSal, double hRAPer, double dAPer) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		HRAPer = hRAPer;
		DAPer = dAPer;
	
	}
	

	public double getBasicSal() {
		return basicSal;
	}


	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}


	public double calculateGrossSalary() {
		return basicSal+HRAPer+DAPer ;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", basicSal=" + basicSal + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + "]";
	}
	
}

