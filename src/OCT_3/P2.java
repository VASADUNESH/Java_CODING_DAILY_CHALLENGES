package OCT_3;

public class P2 {

	public static void main(String[] args) {
		Product p1 = new Product("lap",101,75000);
		p1.display_info();
		
		Product p2 = new Product("",101,75000);
		p2.display_info();
	}

}

/*
Question - 2
--------------

Create a class Product (BLC Class)

Attributes :

name			data type
-------			-----------
productName    	         :  String
productId	     	 :  int
price		     	 :  double

Acess Modifier : private (for all varriable)


Take a no parameterize constroctor and initialize default value to all the properties.

Take another parameterize constructor  to initialize with user-provided values and includes validation to handle invalid inputs.

Methods:

Method Name  	:display_info
Return Type	:void
Acess Modifier 	:public 

Take a Main Class (ELC Class) which is having main method and instantiate the object and execute the method to print the product details.

Test Cases :
--------------
Test Case 1: 

Default Product
Product Name: Default Product
Product ID: 0
Price: 0.0

Test Case 2: 
---------------
User Product
Product Name: Laptop
Product ID: 101
Price: 75000.0

Test Case 3: 
---------------
Invalid Product Creation
Error: Product name cannot be null or empty.
Error: Product ID cannot be negative.
Error: Price cannot be negative.
Product Name: Default Product
Product ID: 0
Price: 0.0
*/