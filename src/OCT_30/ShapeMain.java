package OCT_30;

abstract class Shape{
	abstract double getArea();
	abstract void printDetails();
}

class Rectangle extends Shape{
	private double length, breadth;
	
	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double getArea() {
		return length*breadth;
		
	}
	@Override
	public void printDetails() {
		System.out.println("Shape: Rectangle\n"+"Length :"+this.length+" Breadth: "+this.breadth+"\nArea: "+this.length*this.breadth);
		
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
		
	}
	@Override
	public void printDetails() {
		System.out.println("\nShape: Radius\n"+"Radius :"+radius+"\nArea: "+Math.PI*radius*radius);
		
	}
}
class Triangle extends Shape{
	private double base, height;
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	@Override
	public double getArea() {
		return 0.5*base*height;
		
	}
	@Override
	public void printDetails() {
		System.out.println("\nShape: Triangle\n"+"Base :"+base+" Height: "+height+"\nArea: "+0.5*base*height);
		
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape rectangle = new Rectangle(30.3, 45.4);
	     rectangle.printDetails();

	     Shape circle = new Circle(23.2);
	     circle.printDetails();

	     Shape triangle = new Triangle(146.2, 40.0);
	     triangle.printDetails();
	     
	     System.out.println("\n"+rectangle.getArea()+"\t"+circle.getArea()+"\t"+triangle.getArea());
	}

}
/*

Program: 1
-----------
Define an abstract class 'Shape' with following specifications
Methods:
1. Name: getArea
   ReturnType: double
   Modifier: abstract
2. Name: printDetails
    ReturnType: double
    Modifier: abstract
Define sub-classes of Shape as Rectangle, Circle and Triangle that overrides the methods of shape
Rectangle class
Fields:
	1. length - double
	2. breadth - double
Constructors:
	A parametrized constructor the accepts and initializes length and breadth.
Circle class
Fields:
	1. radius - double
Constructors:
	A parametrized constructo the accepts and initializes radius.
Triangle class
Fields:
	1. base - double
	2. height - double
Constructors:
	A parametrized constructor the accepts and initializes base and height.
All the sub-classes of Shape should override the methods of the shape.
getArea() should return the area of the respective shape.
printDetails() should print the shape details as below
	input:  Rectangle(30.3, 45.4)
	output:
		Type = Rectangle
		Length = 30.3
		Breadth = 45.4
		Area = 1375.62
	input: Circle(23.2)
	output:
		Type = Circle
		Radius = 23.2
		Area = 1690.0736
	input: Triangle(146.2, 40.0);
	output:
		Type = Triangle
		Base = 146.2
		Height = 40.0
		Area = 2924.0
Given a class Testing with main method to test your code.
*/