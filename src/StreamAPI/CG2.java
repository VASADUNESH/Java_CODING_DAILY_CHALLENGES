package StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Given a list of integers, 
 * write a Java Stream API program to find the second highest number
 */
public class CG2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 12, 3, 19, 7, 21, 14, 21);
		
		/*
		 * -> Remove duplicates-> sort -> skip 1 element -> res
		 */
		Optional<Integer> sH= numbers.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		sH.ifPresentOrElse(num->System.out.println("Second Highest: "+sH), ()->System.out.println("No second highest element"));
	}

}
