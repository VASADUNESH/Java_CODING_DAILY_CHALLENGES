package OCT_3;

public class Product {
	private String productName; private int productId;
	private double price;
	
	public Product() {
		this.price =0;
		this.productId =0;
		this.productName="";
		
	}
	

	public Product(String productName, int productId, double price) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		negValue();
	}
	public  void negValue() {
		if(price<=0 || productId<=0 || productName.isEmpty()) {
			System.out.println("Invalid Product Creation");
			System.err.println("Error message indicating invalid input [Must be positive value]");
			System.err.println("Program terminated");
			System.exit(0);
		}
		
	}
	
	public void display_info() {
		System.out.println("Product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]");
	}

	
	
	
}
