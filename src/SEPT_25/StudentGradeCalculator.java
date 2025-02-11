package SEPT_25;

public class StudentGradeCalculator {

	public static void main(String[] args) {

		Student s1 = new Student("Dk",99);
		System.out.println(s1);
		char grade=CalculateStudentGrade.calculateGrade(s1);
		StudentGrade s= new StudentGrade(s1,grade);
		System.out.println(s);
		
	}

}
/*
 Program 01 :
------------
Create a program to find out the Student Grade based on Student Marks :

Create a BLC class Student

Instance Variables :
name : String : private 
marks : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
student from this method.

Create another BLC class StudentGrade.

Instance Variables :
student : Student : private 
studentGrade : char : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[The Student Raj has 'A' Grade]


Create another class CalculateStudentGrade which does not contain any field (Variable)

Methods :
Name of the Method : calculateGrade()
Access Modifier : public, static
Argument : Student 

In calculateGrade() method, task is to find the Student grade based on the Student marks and create and return the StudentGrade
object on the following criteria :

Student Marks                 Grade
> 90                            A
>= 75                           B
>= 60                           C
< 60                            D

Create an ELC class StudentGradeCalculator which contains main method to test the application.
________________________________________________________________________
 */


											