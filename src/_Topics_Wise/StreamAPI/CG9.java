package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
/*
 *  Write a Java Stream API program to find 
 *  the most frequently occurring element in a list of integers
 */
public class CG9 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 5, 6, 4, 7, 5, 4, 8, 5, 5, 6);

		Optional<Map.Entry<Integer, Long>> mostFreq=	numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
		
		mostFreq.ifPresentOrElse(entry->System.out.println("Most frequenty element is: "+entry.getKey()
		+" occurs: "+entry.getValue()+" times"), null);
	}

}
