package sep10;

import java.util.*;

public class p3 {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		NextMultipleOfHundred.getNextMultipleOfHundred(n);
		
		sc.close();
	}

}
