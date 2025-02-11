package Intro;

public class Lab28_8Cli {

	public static void main(String[] args) {
		
		//op(); 				//program 1
		//addcli(args);			//program 2
		//areaOfCircle(args);	//program 3
		//swap(args);			//program 4
		factorial(args);			//program 5
	}
	

	public static void op() {
		int a=20,b=5,c;
		c=a+b;
		System.out.println("Addition: "+c);
		c=a-b;
		System.out.println("Subtraction: "+c);
		c=a*b;
		System.out.println("Multiplication: "+c);
		c=a/b;
		System.out.println("Division: "+c);	
		
	}
	public static void addcli(String[] args) {
		int a,b,r;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		r=a+b;
		System.out.println("Add: "+r);
		
	}
	
	public static void areaOfCircle(String[] args) {
		
		int r= Integer.parseInt(args[0]);
		
		System.out.println("Area of Circle:"+ (3.14*r*r));
	}
	
	public static void swap(String [] args) {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		System.out.println("Before Swapping a = "+a+" b = "+b);
		a=a+b;b=a-b;a=a-b;
		System.out.println("After Swapping a = "+a+" b = "+b);
	}
	private static void factorial(String[] args) {
		int n=Integer.parseInt(args[0]),fact=1,i;
	
		for(i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial :"+ fact);
		
	}
	
}
