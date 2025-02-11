package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.*;
public class FilterNameAndUpperCae {

	public static void main(String[] args) {
		String ans=Stream.of("Rahul","Scott","Raj","Elina","Ram","Puja").filter(name->name.length()>3).map(name->name.toUpperCase()).collect(Collectors.joining(" "));
		System.out.println(ans);
	}

}
