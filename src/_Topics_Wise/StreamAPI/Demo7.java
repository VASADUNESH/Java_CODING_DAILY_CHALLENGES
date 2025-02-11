package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
public class Demo7 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,12,13,14,15,16,17,18,19,20);
		nums.stream().map(n->n+10).forEach(System.out::println);
		System.out.println("-----------------------------------");
		
		String result = nums.stream()
                .filter(n -> n % 2 == 0)      // Filter even numbers
                .map(n -> n * n * n)         // Cube each even number
                .map(String::valueOf)         // Convert integers to strings
                .collect(Collectors.joining(" ")); // Join with spaces

        System.out.println(result); 
		String results =nums.stream().filter(n->n%2==0).map(n->n*n*n).map(String::valueOf).collect(Collectors.joining(" "));
		 System.out.println(results); 
		 
		 
		
		

}
}
