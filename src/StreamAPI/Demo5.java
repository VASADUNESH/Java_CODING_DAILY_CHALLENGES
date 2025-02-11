package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class Demo5 {

	public static void main(String[] args) {
		List<String> names=List.of("Zaheer","Rahul","Aryan","Sailesh","Zaheer");
		String collect=names.stream().distinct().sorted().collect(Collectors.joining(" "));
		System.out.println(collect);
		
		Stream.of("Zaheer","Rahul","Aryan","Sailesh","Zaheer").distinct().sorted().forEach(System.out::print);
	}

}
