package DEC_2;

public class User{
	private String name;
	private VaccineEligibility vaccineEligibility;
	private DoseBooking doseBooking;
	public User(String name, int age, boolean hasHealthCondition) {
		super();
		this.name = name;
		this.vaccineEligibility =new VaccineEligibility(age,hasHealthCondition);
		this.doseBooking = new DoseBooking();
	}
	
	public boolean isEligible() {
		return vaccineEligibility.isEligible();
	}
	
	public void bookDose() {
		if(!isEligible()) {
			throw new RuntimeException(name+" You are not eligible for the vaccine.");
		}
		doseBooking.bookDose();
		System.out.println(name+" Dose booked successfully");
		
	}
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}
	
}