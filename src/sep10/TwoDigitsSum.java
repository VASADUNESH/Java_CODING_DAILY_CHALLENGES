package sep10;

public class TwoDigitsSum {

	public static int getSumOfDigits(int n){
		int s;
		for(s=0;n!=0;n=n/10) {
			s+=n%10;
		}
		return s;

	}

}
