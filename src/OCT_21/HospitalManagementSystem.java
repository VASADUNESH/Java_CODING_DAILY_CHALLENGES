package OCT_21;

class HospitalStaff{
	private String name,role; private int age;

	public HospitalStaff(String name, String role, int age) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
	}
	public void work() {
		System.out.println(name+"is working "+role );
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Doctor extends HospitalStaff{
	private String specialization;

	public Doctor(String name, int age,String specialization) {
		super(name,"Doctor",age);
		this.specialization = specialization;
	}
	@Override
	public void work() {
		System.out.println("Doctor "+getName()+" with specialization in " + specialization +"is treating patients");
		
	}
	
}
class Nurse extends HospitalStaff{
	private int yearsOfExperience;

	public Nurse(String name, int age, int yearsOfExperience) {
		super(name, "Nurse", age);
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public void work() {
		System.out.println("Nurse " + getName() + " with " + yearsOfExperience + " years of experience is taking care of patients.");
	}
}
public class HospitalManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Doctor doctor = new Doctor("Dr. Smith", 35, "Cardiology");
	     Nurse nurse = new Nurse("Mary", 28, 5);

	     doctor.work();
	     nurse.work();

	}

}
/*
HospitalManagementSystem

Design a  Java program that models a Hospital Management System using inheritance:

Create class HospitalStaff with following attributes

declare variable:

private String name;
private int age;
private String role;

create one parameterized Constructor and initialize values

method Name:- work()
Access modifier :-public
return type:-void

this method will print the role and there name with "is working massage"

*create second class Doctor which will inherited with HospitalStaff

declare variable:
private String specialization;

take one parameterized Constructor and initialize values

//Overriding work() method for doctors
it will print Roll and Name with this massage" with specialization in " + specialization + " is treating patient
s."

* Create Nurse class which will inherite HospitalStaff

Variables :-
private int yearsOfExperience;

take  one parameterized Constructor and initialize values

//Overriding work() method for nurses
it will print massage in this format
Role + " " + NAME + " with " + yearsOfExperience + " years of experience is taking care of patients."

create class HospitalManagementSystem inside this take main method where use this class for testing
create object for every class and check
*/