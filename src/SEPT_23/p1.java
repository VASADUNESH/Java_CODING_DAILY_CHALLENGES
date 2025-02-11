package SEPT_23;

import java.util.*;

public class p1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter title: ");
		String title = sc.nextLine();
		
		System.out.println("Enter author: ");
		String author = sc.nextLine();
		
		System.out.println("Enter Price: ");
		double price = sc.nextDouble(); sc.nextLine();
		
		Book b1 = new Book(title,author,price);
		
		b1.printDetails();
		b1.applyDiscount(10);
		

	}

}
