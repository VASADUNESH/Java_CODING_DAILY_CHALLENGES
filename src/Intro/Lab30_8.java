package Intro;

public class Lab30_8 {

	public static void main(String[] args) {
		//finalBill(); //program 1
		//palindrome(); //program 2
		//pattern(); //program 3
		//totsal(); //program 4
		temp(); //program 5

	}
	
	public static void temp() {
		int f=100;
		System.out.println("Celsius: "+(((f-32)*5)/9));
	}
	
	public static void totsal() {
		int sal=50000; float bas=0.15f,hra=0.15f,con=0.1f;
		System.out.println("Total salary: "+(float)((sal)+(sal*bas+sal*hra+sal*con)));
	}
	
	
	public static void finalBill() {
		int cr=4,puff=3;
		System.out.println("Final Bill: "+(cr*60+puff*25-50));
	}
	
	public static void palindrome() {
		
		String word="madam";int i,l=word.length();
		
		for(i=0;i<l;i++) {
			if(word.charAt(i)!=word.charAt(l-1-i)) {
				System.out.println("Not a palindrome");
				System.exit(0);
			}
		}
		System.out.println("Palindrome");
	}
	public static void pattern() {
		int i,j,n=7;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("@");
				}
				else {
					System.out.print(' ');
				}
			}System.out.println();
		}
	}
}

