package DEC_2;

class VaccineEligibility{
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public boolean isEligible() {
		if (age>=18 && age<=60 ) 
			return true;
		return false;
	}
}