package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Write a Java Stream API program to find the longest string in a list.
 */
public class CG6 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "watermelon", "grape");

		//Optional longStr=words.stream().map(str->str.length()).max((s1,s2)->Integer.compare(s1, s2));
		
		Optional longStr=words.stream().max((s1,s2)->Integer.compare(s1.length(), s2.length()));
		longStr.ifPresentOrElse(word->System.out.println("Longest Word: "+word), null);

	}

}
