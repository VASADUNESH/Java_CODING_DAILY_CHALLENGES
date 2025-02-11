package NOV_1;

interface AdvancedArithmetic{
	public abstract int divisiorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	
	@Override
	public int divisiorSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
public class AdvancedArithmeticMain {

	public static void main(String[] args) {
		
		int n=6;
		MyCalculator myCalculator = new MyCalculator();
		
		System.out.println("Divisior of "+n+": "+myCalculator.divisiorSum(n));

	}

}
/*
Program: 1
-----------
Create an interface AdvancedArithmetic  which contains a method signature as:-
public abstract int divisorSum(int n). 

Then write a class called MyCalculator which implements the interface  AdvancedArithmetic.
divisorSum function just takes an integer as input and return the sum of all its divisors. 
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 
Sample Input
6
Sample Output
12
Explanation
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
A class Testing is given to you with a main method. Use this class to test your solution's classes and methods.
*/