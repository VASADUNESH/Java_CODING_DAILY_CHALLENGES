package SEPT_26;

public class Manager {
	private int manId; private String manName;
	private double basicSal,HRAPer, DAPer,projectAllowance;
	
	public Manager(int manId, String manName, double basicSal, double hRAPer, double dAPer, double projectAllowance) {
		super();
		this.manId = manId;
		this.manName = manName;
		this.basicSal = basicSal;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	
	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double calculateGrossSalary() {
		return basicSal+HRAPer+DAPer+projectAllowance ;
	}

	@Override
	public String toString() {
		return "Manager [manId=" + manId + ", manName=" + manName + ", basicSal=" + basicSal + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + "]";
	}
	
}
