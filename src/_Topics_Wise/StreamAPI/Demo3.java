package _Topics_Wise.StreamAPI;
import java.util.stream.*;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		
		List<Integer> listOfNumber=Arrays.asList(11,22,33,44,55,66);
		listOfNumber.stream().filter(num -> num%2==0).forEach(System.out::println);
	}

}
