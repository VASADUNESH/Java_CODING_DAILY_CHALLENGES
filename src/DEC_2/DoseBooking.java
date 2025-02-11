package DEC_2;

class DoseBooking extends Thread{
	private boolean booked=false;
	
	public void bookDose() {
		if(booked) 
			throw new RuntimeException("Dose already booked.");
		
		booked=true;
	}
	public boolean isDoseBooked() {
		if(booked)
			return true;
		return false;
	}
}