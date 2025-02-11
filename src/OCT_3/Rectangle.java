package OCT_3;

public class Rectangle {
	private double width,height;
	
	{
		this.height=0;
		this.width=0;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		negValue();
	}
	
	public  void negValue() {
		if(width<=0 || height<=0 ) {
			System.out.println("Error: Width and height must be non-negative.");
			System.err.println("Error message indicating invalid input [Must be positive value]");
			System.err.println("Program terminated");
			System.exit(0);
		}
		
	}
	
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	
}
