package SEPT_20;

public class P2 {

	public static void main(String[] args) {


		Movie m1 = new Movie("KGF","Action",2018);
		
		System.out.println(m1);
		
		m1.setTitle("Kalki");
		System.out.println(m1.getTitle());
		
		m1.setGenre("SC-fi");
		System.out.println(m1.getGenre());
		
		m1.setReleaseYear(2024);
		System.out.println(m1.getReleaseYear());
		
		System.out.println(m1);
	}

}
/*
Program-2

Design a Movie class with attributes like title, release year, and genre.

Create a class Movie (Business Logic Class)
Instance Variables: 
String title - private
int releaseYear - private
String genre - private


Create a parameterized constructor to initialilize all the fields.
Create getters and setters method for all the fields.

Create another class Main which contains main method (ELC class) which will receive all the instance variable value from BLC class.
Use elc class for:-
// Accessing movie details using getters
// Modifying movie details using setters
// Displaying modified movie details
*/