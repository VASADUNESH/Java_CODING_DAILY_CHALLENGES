package _Topics_Wise.StreamAPI;

import java.util.*;
import java.util.stream.Stream;
public class Demo2 {

	public static void main(String[] args) {
			Stream<Integer> i =Stream.of(1,2,3,4,5,6);
			i.forEach(System.out::println);
			
			Stream<Integer> sA=Stream.of(new Integer[] {17,99,88,66,100,77});
			sA.forEach(System.out::println);

	}

}
