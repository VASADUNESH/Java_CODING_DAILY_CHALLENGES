package sep10;

import java.util.*;

public class p2 {

	public static void main(String[] args) {

		System.out.print("Enter the digit: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		TwoDigitsDifference.getDiffOfDigits(n);
		sc.close();

	}

}
