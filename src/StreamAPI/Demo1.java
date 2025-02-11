package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class Demo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("orange");
		list.add("Mango");
		
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);

	}

}
