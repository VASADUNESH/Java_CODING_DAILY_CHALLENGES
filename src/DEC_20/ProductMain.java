package DEC_20;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 *Program 1:
------------
Write a Program to perform sorting operation on Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the instance variable of Product class.

Implement Comparable interface to write the logic to sort the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.
 */
public class ProductMain {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 799.99));
        products.add(new Product(2, "Smartphone", 499.99));
        products.add(new Product(3, "Tablet", 299.99));
        products.add(new Product(4, "A Smartwatch", 199.99));
        products.add(new Product(5, "Headphones", 89.99));

        System.out.println("Products before sorting:");
        products.forEach(product -> System.out.println(product));

        Collections.sort(products);

        System.out.println("\nProducts after sorting by product name:");
        products.forEach(product -> System.out.println(product));
    }
}

