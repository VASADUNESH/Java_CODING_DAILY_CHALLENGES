package _Topics_Wise.StreamAPI;
import java.util.List;
import java.util.Set;
import java.util.stream.*;
public class FilterDemo {

	public static void main(String[] args) {
		//Retrieve all the names which starts from A and it should not 
		//contain duplicate
		
		List<String> listOfNames=List.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan");
		Set<String> collect= listOfNames.stream().filter(c -> c.startsWith("A")).collect(Collectors.toSet());
		System.out.println(collect);
		
		

	}

}
