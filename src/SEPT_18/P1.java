package SEPT_18;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter bankName: ");
		String bankName = s.nextLine();
		
		System.out.println("Enter bankCustomerName: ");
		String bankCustomerName = s.nextLine(); 
		
		System.out.println("Enter bankAddress: ");
		String bankAddress = s.nextLine();
		
		System.out.println("Enter bankIFSCCode: ");
		String bankIFSCCode = s.nextLine(); 
		
		System.out.println("Enter customerAccountNumber: ");
		int customerAccountNumber = s.nextInt();
		
		System.out.println("Enter currentBalance: ");
		int currentBalance = s.nextInt();
		
		Bank b = new Bank();
		b.setDeatils(bankCustomerName, customerAccountNumber, currentBalance);
		
		while (true) {
			System.out.println("\n1.withdraw\n2.deposit\n3.CurrentBalance\n4.Customer Details\n5.EXIT\nEnter your Choice: ");
			int choice= s.nextInt();
			if (choice==1) {
				System.out.println("Enter amount: ");
				double amount = s.nextDouble();
				b.withdraw(amount);
			}
			else if (choice==2) {
				System.out.println("Enter amount: ");
				double amount = s.nextDouble();
				b.deposit(amount);
			}
			else if (choice==3) {
				b.currentBalance();
			}
			else if (choice==4) {
				System.out.println(b.toString());
			}
			else if (choice==5) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid input");
			}
		}
		
		

	}
	
	

}
/*
A BLC class named as Bank is given in which you need to write the code for performing 
the withdrawal and deposit process and also Checking current balance and displayDetail of 
the Customer (BlC class)
Take Variables (Static + Non Static)

bankName:String,static, private
bankCustomerName:String, private
bankAddress:String,static private
bankIFSCCode:Stirng, static private
customerAccountNumber:int, private
currentBalance:int, private

Note : Static field value we can initialize directly.
---------------------------------------------------
This BLC class will contain 6 methods with the following specifications :-
---------------------------------------------------
1. Name of method : setDeatils
Arguments : 3 parameters
Access modifier : public
 
[bankCustomerName,,customerAccountNumber,c
urrentBalance]
 Return Type : void
Access Modifiers: public
---------------------------------------------------
2. Name of method : withdraw
Arguments : double amount
Return Type : void
Access Modifiers: public
Rules on this Withdraw method:-
In the account, Rs.1000 is the minimum balance to be maintained.
If current balance is Rs.1000 or below, then print InsufficientBalance from the method.
While withdrawing, if the remaining current balance goes less than Rs.1000, then print 
Maintain MinimumBalance message from the method.
While withdrawing, if the remaining current balance is Rs.1000 or above, then print in the 
following manner from the method:-
Transaction Successful.
Available Balance : Rs.1000.0
--------------------------------------------------
3. Name of method : deposit
Arguments : double amount
Return Type : void
Access Modifiers: public 
Rules on this Withdraw method:-
In the account, Rs.1000 is the minimum balance to be maintained.
After deposit from here only call the CurrentBalance Method which will show the Updated 
BALANCE in the following manner from the method:-
For Example : you are trying to deposit 2000 rs in your account and current balance is 
1000 so the output should be 
 Deposited Successfully .
 Available Balance : Rs.3000.0
--------------------------------------------------
4. Name of method : currentBalance
Arguments : No Argument
Return Type : void
Access Modifiers: public
This Method print the Current balance
-------------------------------------------------
5. Name of method : toString()
Arguments : No Argument
Return Type : String
Access Modifiers: public

Here We need to to return all the properties an static Field in String format by Overriding

------------------------------------------------
ELC Class
-------------------------------------------------
An ELC class BankCustomer is given to you, call the method and perform the Operation
[Input you have to take from the Scanner class]
*/