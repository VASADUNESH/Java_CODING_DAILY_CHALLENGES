package DEC_20;

import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(3, "Alice", 250.50));
        customers.add(new Customer(1, "Bob", 150.75));
        customers.add(new Customer(4, "Charlie", 300.00));
        customers.add(new Customer(2, "Diana", 200.25));

        System.out.println("Customers before sorting:");
        customers.forEach(System.out::println);

        System.out.println("\nSorting by Customer Number:");
        Collections.sort(customers, new CustomerNumberComparator());
        customers.forEach(System.out::println);

        System.out.println("\nSorting by Customer Name:");
        Collections.sort(customers, new CustomerNameComparator());
        customers.forEach(System.out::println);

        System.out.println("\nSorting by Customer Bill:");
        Collections.sort(customers, new CustomerBillComparator());
        customers.forEach(System.out::println);
		

	}

}
