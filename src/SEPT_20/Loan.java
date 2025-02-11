package SEPT_20;

public class Loan {
	private double principle,duration;
	private int interestRate;
	
	public Loan(double principle, double duration, int interestRate) {
		
		this.principle = principle;
		this.duration = duration;
		this.interestRate = interestRate;
		negValue();
	}
	
	public Boolean negValue() {
		
		if( principle <= 0 || duration <= 0 || interestRate <=0) {
			System.err.println("Error message indicating invalid input [Must be positive value]");
			System.err.println("Program terminated");
			System.exit(0);
		}
		return true;
	}
	
	public double calculateMonthlyPayment() {
		return  (principle*duration*interestRate)/1200;
	}
	
	public double getPrincipal() {
		return principle;
	}
	
	public double getduration() {
		return duration;
	}
	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		return "Loan [principle=" + principle + ", duration=" + duration + ", interestRate=" + interestRate + "]";
	}
	
}
