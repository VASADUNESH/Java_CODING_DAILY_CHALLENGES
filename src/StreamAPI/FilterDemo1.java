package StreamAPI;

import java.util.*;
import java.util.stream.*;



public class FilterDemo1 {

	public static void main(String[] args) {
		List<String> collect=Stream.of("Aryan","Ankit","Rohit","Raj","Aniket","Raj","Aryan").filter(c->c.startsWith("R")).distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}

}
