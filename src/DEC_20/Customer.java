package DEC_20;

import java.util.Comparator;

public class Customer {
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
}
class CustomerNumberComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getCustomerNumber().compareTo(c2.getCustomerNumber());
	}
	
}

class CustomerNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getCustomerName().compareTo(c2.getCustomerName());
	}
	
}
class CustomerBillComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getCustomerBill().compareTo(c2.getCustomerBill());
	}
	
}
