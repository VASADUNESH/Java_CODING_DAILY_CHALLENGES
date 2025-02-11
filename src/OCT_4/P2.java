package OCT_4;

public class P2 {

	public static void main(String[] args) {
		A obj = new A();

	}

}
/*
Program 02 :
------------
Create a BLC class called A
 Instance variable
 private int data = 15;

 Create a no-argument constructor, where create the object for class B (Another BLC class) and call the non-static display method available in class B.

 Create an instance method show() in class A, which will print instance variable data.

 Create an another BLC class B
 Instance variable
 private A obj;
 
 Create a parameterized constructor which takes class A as a parameter to initialize the instance variable

 Create a display method inside class B which internally calling the show() method of class A

 Create an ELC class Test which contains main method to test the application.

 Note :- BLC and ELC all the classes must be declared as public.

 Expected Output:

instance variable data in A = 15
*/