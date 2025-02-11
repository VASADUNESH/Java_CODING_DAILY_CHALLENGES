package OCT_4;

public class P1 {

	public static void main(String[] args) {
		PanCard panCard = new PanCard();
	}

}

/*
Program: 1
----------
Create two BLC classes Person and PanCard, both must be declared with public access modifier. 
Create one ELC class Test which contains main method to test the application 
Designing of Person class : 
Instance Variable : 
private PanCard obj; 
create a parameterized constructor which accept PanCard class as a parameter, In this constructor 
initialize the instance variable and call the non static display method of PanCard class. 
Designing of PanCard class : 
Instance Variable : private String panId; 
create one no argument constructor where initialize the 
panId and create the object of Person class 
Define display method to print panId; Define main method in ELC class Test to test the application.*/