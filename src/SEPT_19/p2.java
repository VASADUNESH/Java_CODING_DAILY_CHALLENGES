package SEPT_19;

import java.util.*;

public class p2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter itemName: ");
		String itemName = sc.nextLine();
		
				
		System.out.println("Enter Price per unit: ");
		double pricePerUnit = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter quantity in stock: ");
		int quantityInStock = sc.nextInt();
		sc.nextLine();
		
		InventoryItem i1 = new InventoryItem(itemName,pricePerUnit,quantityInStock);
		
		System.out.println(i1);
		System.out.println("Total Value of Apples in Stock: "+i1.calculateTotalValue());
		
	}

}
/*
Question -2   
---------------  
Design a inventory system for a retail store :
  
InventoryItem Class: [BLC Class]

Create an InventoryItem class with the following 
 
Attributes:
--------------
Names			dataType
---------		-----------
itemName        	String 
pricePerUnit    	double 
quantityInStock 	int 

Implement a constructor that takes parameters to initialize the attributes of the InventoryItem object.

 Method:
-------------
MethodName  		:calculateTotalValue()
Return Type		:double
Access Modifier 	:public

This method should calculate and return the total value of the inventory item in stock, which is the product of the price per unit and the quantity in stock.


Take a InventoryMain class (ELC Class) which is having  main method to  Create instances of the InventoryItem class, perform calculations, and display relevant information such as the total value of the item in stock and whether a reorder is required.

Taste Case -1
-----------------
Sample Input :

Item Name: "Apples"
Price per Unit: 10
Quantity in Stock: 15

Expected Output: 
Total Value of Apples in Stock: 150

Test Case 2:
--------------- 
Sample Input:

Item Name: "Oranges"
Price per Unit: -5.0
Quantity in Stock: 20

Expected Output: 
Error message indicating invalid price.

Test Case 3: 
---------------
Sample Input :

Item Name: "Bananas"
Price per Unit: 5.0
Quantity in Stock: -10

Expected Output:
 Error message indicating invalid quantity.

Test Case 4 :
--------------- 
sample input :

Item Name: ""
Price per Unit: 8.0
Quantity in Stock: 10

Expected Output:
 Error message indicating invalid item name.
*/