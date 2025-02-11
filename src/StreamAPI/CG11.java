package StreamAPI;
import java.util.*;
import java.util.stream.*;
/*
 * Write a Java Stream API program 
 * to convert a list of objects (Person) into a Map 
 * with name as the key and age as the value.
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



// Your code here

public class CG11 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			    new Person("Alice", 30),
			    new Person("Bob", 25),
			    new Person("Charlie", 35)
			);
		
		Map<String,Integer>collect	=people.stream().collect(Collectors.toMap(p->p.name, p->p.age));
		System.out.println(collect);
	}

}
