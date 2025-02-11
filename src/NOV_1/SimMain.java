package NOV_1;

interface SimCardInterface{
	String getPhoneNumber();
	String getNetwokProvider();
	void activation();
	void deactivation();
}
interface MobilePhoneInterface {
	void inserting(SimCardInterface simCard);
	void removing();
	void makeCalls(String number);
	void sendText(String message);
}

class Jio implements SimCardInterface{
	
	private String phoneNumber; private boolean activate;
	public Jio(String phoneNumber){
		this.phoneNumber = phoneNumber;
		this.activate = false;
	}
	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public String getNetwokProvider() {
		return "Jio";
	}

	@Override
	public void activation() {
		this.activate = true;
		System.out.println("Sim Activited");
		
	}

	@Override
	public void deactivation() {
		this.activate = false;
		System.out.println("Sim deactivated");
		
	}
	
}

class Airtel implements SimCardInterface{
	
	private String phoneNumber; private boolean activate; 
	
	
	public Airtel(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.activate = false;
	}
	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	@Override
	public String getNetwokProvider() {
		return "Airtel";
	}
	@Override
	public void activation() {
		this.activate = true;
		System.out.println("Sim Activated");
	}
	@Override
	public void deactivation() {
		
		this.activate = false;
		System.out.println("Sim deactivated");
	}
	
	
	
}
class Bsnl implements SimCardInterface{
	
	private String phoneNumber; private boolean activate; 
	
	
	public Bsnl(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.activate = false;
	}
	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	@Override
	public String getNetwokProvider() {
		return "Bsnl";
	}
	@Override
	public void activation() {
		this.activate = true;
		System.out.println("Sim Activated");
	}
	@Override
	public void deactivation() {
		
		this.activate = false;
		System.out.println("Sim deactivated");
	}
	
	
	
}

class MobilePhone implements MobilePhoneInterface{
	private SimCardInterface simCard;
	@Override
	public void inserting(SimCardInterface simCard) {
		this.simCard = simCard;
		simCard.activation();
		System.out.println("Inserted Sim card"+simCard.getNetwokProvider()+" Number: "+simCard.getNetwokProvider());
	}

	@Override
	public void removing() {
		if (simCard == null) {
			System.out.println("No Sim Card");
		}
		else {
			simCard.deactivation();
			System.out.println("Sim card Deactivated: "+simCard.getNetwokProvider()+" Number: "+simCard.getNetwokProvider());
		}
		
	}

	@Override
	public void makeCalls(String number) {
		if (simCard == null) {
			System.out.println("No Sim Card");
		}
		else {

			System.out.println("Calling to : "+number+" using network "+simCard.getNetwokProvider());
		}
		
		
	}

	@Override
	public void sendText(String message) {
		if (simCard == null) {
			System.out.println("No Sim Card");
		}
		else {

			System.out.println("Message to : "+message+ " using network "+simCard.getPhoneNumber());
		}
		
	}
	
}
public class SimMain {

	public static void main(String[] args) {
		SimCardInterface jioSIM = new Jio("9876543210");
        SimCardInterface airtelSIM = new Airtel("8765432109");
        SimCardInterface bsnlSIM = new Bsnl("7654321098");
        
        MobilePhone myPhone = new MobilePhone();
        
        myPhone.inserting(jioSIM);
        myPhone.makeCalls("1234567890");
        myPhone.sendText("Hello using Jio!");
        myPhone.removing();
        
      

	}

}
