package OCT_1;

public class Student {
	int studentId; String name; double examFee;
	
	
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}


	public String displayDetails() {
		return "Student studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "";
	}
	
	public double payFee(double amount) {
		
		double totalFee = examFee;
		return  totalFee - amount;
	}


	@Override
	public String toString() {
		return  displayDetails();
	}
	
	
}

class DayScholar extends Student{
	
	double transportFee;
	
	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	
	public String displayDetails() {
		examFee += transportFee;
		return "DayScholar transportFee=" + transportFee + ", "+ super.displayDetails();
	}
	
	
}

class Hosteller extends Student{

	double hostelFee;
	
	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee =hostelFee;
	}

	
	public String displayDetails() {
		examFee+=hostelFee;
		return "Hosteller hostelFee=" + hostelFee + ", " + super.displayDetails();
	}
	
	
	
}
