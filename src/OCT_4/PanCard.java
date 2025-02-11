package OCT_4;

public class PanCard {
	private String panId;
	
	public PanCard() {
		panId="1234Aq1";
		Person person = new Person(this);
	}
	public void display() {
		System.out.println("PanId:"+panId);
	}
}
