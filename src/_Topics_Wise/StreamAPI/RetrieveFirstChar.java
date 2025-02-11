package _Topics_Wise.StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class RetrieveFirstChar {

	public static void main(String[] args) {
		String res=List.of("Jaya","Arnav","Virat","Aryan").stream().map(f->String.valueOf(f.charAt(0))).collect(Collectors.joining(","));
		System.out.println(res);
	}

}
