package sep10;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {


		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		RoundedSum.sumOfRoundedValues(a, b, c);
		sc.close();
	}
	
}
