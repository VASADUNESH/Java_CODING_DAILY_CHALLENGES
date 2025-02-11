package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Write a Java Stream API program 
 * to partition a list of integers into even and odd numbers.
 */
public class CG10 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Map<Boolean, Set<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0, Collectors.toSet()));
		System.out.println("Even: "+collect.get(true));
		System.out.println("Odd: "+collect.get(false));
	}

}
