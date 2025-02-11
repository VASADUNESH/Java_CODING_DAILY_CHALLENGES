package DEC_3;

public class PetrolPump {
	
	public synchronized void refillCar(String carName) throws InterruptedException {
		System.out.println(carName+" started refilling...");
		Thread.sleep(3000);
		System.out.println(carName+" completed refilling!\n");
		Thread.sleep(1000);
	}
}
