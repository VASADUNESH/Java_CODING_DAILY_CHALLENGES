package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Given a list of integers, 
 * write a Java Stream API program to find the sum of all even numbers
 */
public class CG1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum =numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println("sum of all even numbers: "+sum);

	}

}
