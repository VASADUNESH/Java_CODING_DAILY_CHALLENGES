package StreamAPI;

import java.util.*;
import java.util.stream.*;
/*
 * Write a Java Stream API program 
 * to count the number of words in a list that have more than 5 characters
 */
public class CG4 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "mango", "pineapple", "grape");

		long count = words.stream().filter(str->str.length()>5).count();
		System.out.println(count);


	}

}
