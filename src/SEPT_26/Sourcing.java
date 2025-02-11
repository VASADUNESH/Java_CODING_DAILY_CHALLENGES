package SEPT_26;

public class Sourcing {
	private int sourcingId, enrollmentTarget, enrollmentReached; 
	private String sourcingName;
	private double basicSal,HRAPer, DAPer,perkPerEnrollment;
	
	public Sourcing(int sourcingId, int enrollmentTarget, int enrollmentReached, String sourcingName, double basicSal,
			double hRAPer, double dAPer, double perkPerEnrollment) {
		super();
		this.sourcingId = sourcingId;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.sourcingName = sourcingName;
		this.basicSal = basicSal;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double calculateGrossSalary() {
		return basicSal +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment) ;
	}

	@Override
	public String toString() {
		return "Sourcing [sourcingId=" + sourcingId + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached="
				+ enrollmentReached + ", sourcingName=" + sourcingName + ", basicSal=" + basicSal + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
}
