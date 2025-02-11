package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Given a list of integers, 
 * write a Java Stream API program to find and print only the duplicate elements
 */
public class CG5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 5, 7, 8, 4, 9, 5, 10, 11, 7);
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		Set<Integer> duplicates=numbers.stream().filter(n-> !uniqueNumbers.add(n)).collect(Collectors.toSet());
		
		System.out.println("Duplicate: "+duplicates);
		System.out.println("Unique: "+uniqueNumbers);
		

	}

}
