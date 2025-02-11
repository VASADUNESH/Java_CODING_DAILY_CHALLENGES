package SEPT_23;

public class Book {
	private String title, author; private double price;

	double discountPercentage;
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		negValue();
	}
	
	public Boolean negValue() {
		
		if( title.length() <= 0 && author.length() <= 0 && price <=0 ) {
			System.err.println("Error message indicating invalid input [Must be positive value]");
			System.err.println("Program terminated");
			System.exit(0);
		}
		return true;
	}

	public void printDetails() {
		System.out.println("Book [title=" + title + ", author=" + author + ", price=" + price + "]");
	}

	public void applyDiscount(double discountPercentage) {
		System.out.println("Appling Discount:" + (price-(price/discountPercentage)));
	}
	
}
