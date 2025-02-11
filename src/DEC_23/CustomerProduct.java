package DEC_23;
import java.util.*;

record Product(Integer pId, String pName) {
	public Product{
		if (pId<=0) {
			throw new IllegalArgumentException("PID must be Positive");
		}
	}
}

public class CustomerProduct {

	public static void main(String[] args) {
		
		// sort pId Asc
		TreeSet <Product> laptops = new TreeSet<>(Comparator.comparingInt(Product::pId));
		laptops.add(new Product(2, "Asus"));
		laptops.add(new Product(1, "Lenovo"));
		laptops.add(new Product(4, "Hp"));
		laptops.add(new Product(3, "Dell"));
		
		System.out.println("sort pId Asc: "+laptops);
		//sort pId Des
		TreeSet <Product> laptops1 = new TreeSet<>(Comparator.comparingInt(Product::pId).reversed());
		laptops1.add(new Product(2, "Asus"));
		laptops1.add(new Product(1, "Lenovo"));
		laptops1.add(new Product(4, "Hp"));
		laptops1.add(new Product(3, "Dell"));

		System.out.println("\nsort pId Desc : "+laptops1);
		
		//name in Alphabetical order
		TreeSet <Product> laptops2 = new TreeSet<>(Comparator.comparing(Product::pName));
		laptops2.add(new Product(2, "Asus"));
		laptops2.add(new Product(1, "Lenovo"));
		laptops2.add(new Product(4, "Hp"));
		laptops2.add(new Product(3, "Dell"));
		
		System.out.println("\nname in Alphabetical order : "+laptops2);

		//name in Reverse order
		TreeSet <Product> laptops3 = new TreeSet<>(Comparator.comparing(Product::pName).reversed());
		laptops3.add(new Product(2, "Asus"));
		laptops3.add(new Product(1, "Lenovo"));
		laptops3.add(new Product(4, "Hp"));
		laptops3.add(new Product(3, "Dell"));
		
		System.out.println("\nname in Reverse order : "+laptops3);
		
	}

}
