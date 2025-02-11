package SEPT_11;

public class Calculate {
	public static String checkSpyNum (int n) {
		int sum,pro;
		for(sum=0,pro=1;n!=0;n=n/10) {
			sum+=n%10;
			pro*=n%10;
		}
		return (sum==pro) ? "Spy number" : "Not a Spy number";
	}
}
