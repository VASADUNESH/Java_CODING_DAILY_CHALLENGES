package OCT_18;

class Shape {
	
	public double calculateVolume(double sideLength) {
		
		return Math.pow(sideLength,3);
	}
}

class Cylinder extends Shape{
	public double calculateVolume(double radius, double height) {
		return Math.PI*Math.pow(radius, 2)*height;
	}
}

class Sphere extends Shape{
	public double calculateVolume(double radius) {
		return (4/3)*Math.PI*Math.pow(radius, 2);
	}
}

public class Shapes{
	public static void main( String args[]) {
		
        Cylinder cylinder = new Cylinder();
        Sphere sphere = new Sphere();

        double sideLength = -3.0;
        double radius = 2.0;
        double height = 2.0;

        // Test cases
        if (sideLength < 0) {
            System.out.println("Error: Side length cannot be negative.");
        } else {
            System.out.println("Volume of the Cube: " + cylinder.calculateVolume(sideLength));
        }

        System.out.println("Volume of the Cylinder: " + cylinder.calculateVolume(radius, height));
        System.out.println("Volume of the Sphere: " + sphere.calculateVolume(radius));

	}
}












/*
 
Question -1
--------------
volume of a cube, cylinder, and sphere.

Implement methods to calculate the volume of a cube, cylinder, and sphere. Overload these methods to handle different combinations of parameters like radius, height, and side length.

 Parent class Shape

 Method to calculate volume of a cube

Method Name calculateVolume parameter (double sideLength)

Access Modifier:-

public 

Return type:-

double


Take another class Cylinder

 Method to calculate volume of a cylinder

Method Name calculateVolume parameter (double radius,double height)

Access Modifier:-

public 

Return type:-

double


Method to calculate volume of a sphere

Method Name calculateVolume parameter (double radius)

Access Modifier:-

public 

Return type:-

double



 Subclass Cube inheriting from Shape

 Method overriding to provide specific implementation for cubes

 Reusing the parent class method for cubes



   Subclass Cylinder inheriting from Shape

 Method overriding to provide specific implementation for cylinders

 Reusing the parent class method for cylinders


 Subclass Sphere inheriting from Shape

 Method overriding to provide specific implementation for spheres
 Reusing the parent class method for spheres

 Create a class MainShape which contains main method to test your code.
 Creating objects of different shapes, Calculating volumes using different methods based on shape
 Call the methods.


Formula:-

Cube:- n*n*n

Cylender:- pi*r*r*h

Sphere:-4/3*pi*r*r



Volume of the Cube: 27.0

Volume of the Cylinder: 25.132741228718345

Volume of the Sphere: 14.137166941154069



Test Case 1: 
---------------
Negative Side Length for Cube

Input:
Cube side length: -3.0

Expected Output:
"Error: Side length cannot be negative."

Test Case 2: Valid Input for Cube
Input:
Cube side length: 3.0
Expected Output:
Volume of the Cube: 27.0

Test Case 3: Valid Input for Cylinder
Input:
Cylinder radius: 2.0, height: 2.0
Expected Output:
Volume of the Cylinder: 25.132741228718345




 */
