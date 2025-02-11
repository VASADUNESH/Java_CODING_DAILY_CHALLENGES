package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Given a list of strings, 
 * write a program to filter out strings that start with "A" and 
 * collect them into a new list
 */
public class CG3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Grapes", "Apricot");
		
		List<String> res=names.stream().filter(str->str.startsWith("A")).collect(Collectors.toList());
		System.out.println(res);

	}
}
