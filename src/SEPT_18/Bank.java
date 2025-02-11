package SEPT_18;

public class Bank {
	
	private static String bankName; private String bankCustomerName; 
	private static String bankAddress; private static String bankIFSCCode; 
	private int customerAccountNumber; private int currentBalance;
	
	public void setDeatils(String bankCustomerName,int customerAccountNumber,int currentBalance) {
		
		this.bankCustomerName=bankCustomerName;
		this.customerAccountNumber=customerAccountNumber;
		this.currentBalance=currentBalance;
		
	}
	
	public void withdraw(double amount) {
		if (currentBalance-amount<1000) {
			System.out.println("Maintain MinimumBalance");
		}
		else if (currentBalance>=1000) {
			currentBalance-=amount;
			System.out.println("Transaction Successful.\r\n"
					+ "Available Balance : Rs."+currentBalance);
		}
		else if (currentBalance<1000) {
			System.out.println("InsufficientBalance");
		}
	}
	
	public void deposit(double amount) {
		if (currentBalance-amount<1000) {
			System.out.println("Maintain MinimumBalance");
		}
		else if (currentBalance>=1000) {
			currentBalance+=amount;
			System.out.println("Transaction Successful.\r\n"
					+ "Available Balance : Rs."+currentBalance);
		}
		else if (currentBalance<1000) {
			System.out.println("InsufficientBalance");
		}
	}
	
	public void currentBalance() {
		System.out.println("Available Balance : Rs."+currentBalance);
	}

	@Override
	public String toString() {
		return "Bank [bankCustomerName=" + bankCustomerName + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}

	
}
