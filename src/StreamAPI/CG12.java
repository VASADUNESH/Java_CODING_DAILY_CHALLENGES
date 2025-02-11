package StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Write a Java Stream API program to find the second highest number in a list
 */
public class CG12 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 25, 15, 50, 40, 50, 35);
		
		Optional<Integer> sH = numbers.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		System.out.println(sH);
	}

}
