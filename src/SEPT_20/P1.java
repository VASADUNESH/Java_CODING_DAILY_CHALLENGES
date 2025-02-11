package SEPT_20;

public class P1 {

	public static void main(String[] args) {


		Loan l1 = new Loan(10000,2,10);
		
		System.out.println(l1);
		System.out.println(l1.calculateMonthlyPayment());
		System.out.println(l1.getPrincipal());
		System.out.println(l1.getInterestRate());
		System.out.println(l1.getduration());
		System.out.println(l1);
	}

}
/*
Program 01 :
-----------
Create a Loan class to calculate loan payments based on principal, interest rate, and duration.

Class name Loan with the Instance variable double principal ,private  
 double interestRate ,private
 int durationMonths ,private
1.Create a public constructor with parameters are principal,interestRate and durationMonths. To initialise the instance variable.
Access modifier:-

public

If any parameter value is 0 the print "Error".

2.Create a method name as calculateMonthlyPayment().Public method to calculate the monthly loan payment

Access modifier:-
public
return type:-
double
3.Create a method name as getPrincipal().To get the principal amount

Access modifier:-

public

return type:-

double

4.Create a method name as getInterestRate().To get the interest rate

Access modifier:-

public
return type:-
double

5.Create a method name as getDurationMonths().To get the loan duration in months

Access modifier:-
public
return type:-

int
Create a Class CheckLoan to check your functionalities of the class.Like to intialise the instance variable which is present in Loan class.
*/