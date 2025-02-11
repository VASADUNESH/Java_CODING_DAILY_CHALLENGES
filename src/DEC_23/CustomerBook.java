package DEC_23;
import java.util.*;
record Book(String name, String author) implements Comparable<Book>{

	@Override
	public int compareTo(Book b1) {
		return this.name.compareTo(b1.name);
	}
	
}
public class CustomerBook {

	public static void main(String[] args) {
		
		TreeSet<Book> book = new TreeSet<>();
		
		 book.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
	     book.add(new Book("To Kill a Mockingbird", "Harper Lee"));
	     book.add(new Book("1984", "George Orwell"));
	     book.add(new Book("Pride and Prejudice", "Jane Austen"));
	     book.add(new Book("Moby Dick", "Herman Melville"));
	     
	     System.out.println("Books sorted in alphabetical order:");
	        for (Book b : book) {
	            System.out.printf("Name: %s, Author: %s%n", b.name(), b.author());
	        }

	}

}
