package OCT_21;

import java.util.*;

class Shape {
	public static Shape randshape() {
		Shape shape = null;
//		double rn = Math.random() * 3;
//		int rN = (int) rn;
		
		 int rN = new Random().nextInt(3);
		 System.out.println(rN);
		switch (rN) {
		case 0:
			shape = new Circle();
			break;
		case 1:
			shape = new Square();
			break;
		case 2:
			shape = new Triangle();
			break;
		default:
			System.out.println("Default message");
		}
		return shape;
	}

	public void inDraw() {
		System.out.println("Shape Draw");
	}

	public void erase() {
		System.out.println("Shape erase");
	}
}

class Circle extends Shape {
	@Override
	public void inDraw() {
		System.out.println("Circle Draw");
	}

	@Override
	public void erase() {
		System.out.println("Circle erase");
	}
}

class Triangle extends Shape {
	@Override
	public void inDraw() {
		System.out.println("Triangle Draw");
	}

	@Override
	public void erase() {
		System.out.println("Triangle erase");
	}
}

class Square extends Shape {
	@Override
	public void inDraw() {
		System.out.println("Square Draw");
	}

	@Override
	public void erase() {
		System.out.println("Square erase");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Shape shape = Shape.randshape();

			shape.inDraw();
			shape.erase();
		}

	}

}
/*
 * Question-1 -------------- Create a BLC class Named as Shape and it have three
 * sub classes named as Circle, Triangle and Squar e for each class have two
 * methods called as draw() and erase()
 * 
 * For Shape class
 * 
 * Methods: public static Shape randshape() No Argument constructor randshape():
 * Using switch ((int) (Math.random()*3)) case 0: create an object for Circle
 * Object using return case 1: create an object for Square Object using return
 * case 2: create an object for Triangle Object using return default: Print as
 * default message finally return an object for Shape class Use this class to
 * test your solution's class and methods in main method
 * 
 * For Shape class Methods: In draw():void and erase():void and No argument
 * constructor draw(): print "shape draw" erase(): print "Shape erase" For
 * Circle class sub class of Shape class Methods: In draw():void and
 * erase():void and No argument constructor Override: draw() method print
 * "Circle draw" and erase() method print "Circle erase"
 * 
 * For Triangle class sub class of Shape class
 * 
 * Take No argument constructor
 * 
 * Methods:
 * 
 * In draw():void erase():void Override: draw() method print "Triangle draw" and
 * erase() method print "Triangle erase"
 * 
 * 
 * For Square class sub class of Shape class
 * 
 * Take No argument constructor
 * 
 * Methods: draw():void erase():void
 * 
 * Override: draw() method print "Square draw" and erase() method print
 * "Square erase"
 * 
 * 
 * 
 * Create Main class(ELC Class) named as ShapeDemo and havinf main method and
 * call the method and execute it.
 * 
 * Test Cases -1 : ------------------- Valid Case: Random Shape Generation
 * 
 * Sample Input: [No input needed] Expected Output (example run, actual output
 * will vary due to randomness):
 * 
 * Triangle draw Triangle erase
 * 
 * Square draw Square erase
 * 
 * Circle draw Circle erase
 * 
 * Circle draw Circle erase
 */