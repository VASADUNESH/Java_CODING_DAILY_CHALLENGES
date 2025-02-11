package StreamAPI;
import java.util.stream.*;
import java.util.*;
/*
 * Write a Java Stream API program to convert a list of strings to uppercase.
 */
public class CG8 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "python", "c++", "javascript");
		
		//words.stream().map(str->str.toUpperCase()).forEach(System.out::println);
	
		String collect=words.stream().map(str->str.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(collect);
	}

}
