package sep10;

import java.util.*;
public class p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		int n = sc.nextInt();
		
		System.out.println("Sum: "+ TwoDigitsSum.getSumOfDigits(n));
		sc.close();
		

	}

}
