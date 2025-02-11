package Intro;

public class Lab29_8Cli {

	public static void main(String[] args) {

		//cube(args); //Program 1
		//areaOfRectangle(args);//program 2
		//avg(args); //program 3
		//twoDigit(args); //program 4
		//calculteTax(args); //program 5
	}
	
	public static void calculteTax(String[] args)
	{
		double Salary=Integer.parseInt(args[0]);
		double tax=0;
		if(Salary>=990000)
		{
			tax=Salary*0.049;
		}
		System.out.println("Tax="+tax);
	}
	
	public static void twoDigit(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println("Sum :"+(n%10+n/10));
		
		
	}
	
	public static void avg(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		int tot=n1+n2+n3;
		System.out.println("Total: "+tot+"\nAverage: "+tot/3);
	}
	
	public static void areaOfRectangle(String[] args) {
		int l=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Area of Rectangle: "+(l*b));
	}
	
	public static void cube(String[] args) {
		int i=Integer.parseInt(args[0]);
		System.out.println(i+" Cube is "+(i*i*i));
	}
}
