package DEC_3;

public class Car implements Runnable {
	private String name;
	private PetrolPump petrolPump;
	
	
	
	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}



	@Override
	public void run() {
		try {
			petrolPump.refillCar(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
