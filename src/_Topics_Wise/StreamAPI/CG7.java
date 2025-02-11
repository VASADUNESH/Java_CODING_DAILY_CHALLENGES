package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Write a Java Stream API program 
 * to concatenate all strings in a list separated by a comma.
 */
public class CG7 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Java", "Python", "C++", "JavaScript");
		
		String res=words.stream().collect(Collectors.joining(","));
		System.out.println(res);

	}

}
