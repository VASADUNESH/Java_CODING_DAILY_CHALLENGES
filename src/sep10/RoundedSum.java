package sep10;

public class RoundedSum {
	
	public static void sumOfRoundedValues(int a, int b, int c) {
		System.out.println("Add: "+(round(a)+round(b)+round(c)));
	}
	public static int round(int num) {
        return ((num + 5) / 10) * 10; 
    }
}
