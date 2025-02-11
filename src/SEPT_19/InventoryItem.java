package SEPT_19;

public class InventoryItem {
	private String itemName; private double pricePerUnit;
	private int quantityInStock;
	
	public InventoryItem( String itemName , double pricePerUnit , int quantityInStock) {
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
		negValue();
	}
	public Boolean negValue() {
			
		if	(itemName.length()<=0 || pricePerUnit <=0 || quantityInStock<=0) {
			System.err.println("Error message indicating invalid input [Must be positive value]");
			System.err.println("Program terminated");
			System.exit(0);
		}
		return true;
	}
	public double calculateTotalValue() {
		
		return pricePerUnit*quantityInStock;
	}

	@Override
	public String toString() {
		return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityInStock="
				+ quantityInStock + "]";
	}
	
}
