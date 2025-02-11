package SEPT_19;

public class Employee {
	
	private  String name,dept,per; private  int  age; private static  double sal;

	public Employee(String name, String dept, String per,double sal, int age) {
		this.name=name;
		this.dept=dept;
		this.per=per;
		this.sal=sal;
		this.age=age;
		negValue();
	}
	public Boolean negValue() {
		if(name.length()<=0 || dept.length()<=0 || per.length()<=0 || sal<=0 || age<=0) {
			System.err.print("Error: Invalid input : Must be positive value and string too");
			return false;
		}
		return true;
	}
	
	public  double updateSalary(double newsal) {
			if (negValue()) {
				sal+=newsal;
				return newsal;
			}
			return newsal;
	}
	
	public  void performance(String per) {
		if (negValue()) {
			if (per.equals("good")) {
				sal+=10000;
				System.out.println("Added bonous 10k");
			}
			else if (per.equals("avg")) {
				sal+=5000;
				System.out.println("Added bonous 5k");
			}
			else {
				System.out.println("No bonous");
			}
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", per=" + per + ", age=" + age +", Salary="+sal+"]";
	}
	

	  
	
	
	
}
