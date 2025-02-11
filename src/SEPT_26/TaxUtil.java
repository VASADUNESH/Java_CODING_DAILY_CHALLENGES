package SEPT_26;

public class TaxUtil {
	public double calculateTax(Employee e) {
		if(e.calculateGrossSalary()>50000) {
			return e.getBasicSal()+e.getBasicSal()*0.2;
		}
	
		return e.getBasicSal()+e.getBasicSal()*0.05;
	}
	
	public double calculateTax(Manager m) {
		if(m.calculateGrossSalary()>50000) {
			return m.getBasicSal()+m.getBasicSal()*0.2;
		}
	
		return m.getBasicSal()+m.getBasicSal()*0.05;
	}
	
	public double calculateTax(Trainer t) {
		if(t.calculateGrossSalary()>50000) {
			return t.getBasicSal()+t.getBasicSal()*0.2;
		}
	
		return t.getBasicSal()+t.getBasicSal()*0.05;
	}
	
	public double calculateTax(Sourcing s) {
		if(s.calculateGrossSalary()>50000) {
			return s.getBasicSal()+s.getBasicSal()*0.2;
		}
	
		return s.getBasicSal()+s.getBasicSal()*0.05;
	}
}
