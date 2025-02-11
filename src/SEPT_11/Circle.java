package SEPT_11;

public class Circle {
	public static float getArea(int r) {

		if (r<=0) {
			return 0;
		}
		
		return (float)(3.14*r*r);
	}
}
