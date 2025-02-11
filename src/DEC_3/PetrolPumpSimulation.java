package DEC_3;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException {

		PetrolPump petrolPump = new PetrolPump();
		
		/*Car cars[] = new Car[3];
		cars[0] = new Car("Ford", petrolPump);
		cars[1] = new Car("Naxon", petrolPump);		
		cars[2] = new Car("Maruti", petrolPump);
		
		Thread []threads = new Thread[cars.length];
		threads[0] = new Thread(cars[0]);
		threads[1] = new Thread(cars[1]);
		threads[2] = new Thread(cars[2]);
		
		for(Thread thread : threads)
		{
			thread.start();
			thread.join();
		}
		
		*/
		
		
		String cars [] = {"BMW","Mahindra","Suzike","KIA","THOR","TATA","Honda"};
		
		Thread[] threads = new Thread[cars.length];

        for (int i = 0; i < cars.length; i++) {
            Car car = new Car(cars[i], petrolPump);
            threads[i] = new Thread(car);
            threads[i].start();
        }

        for (Thread thread : threads) {
           thread.join();
        }

        System.out.println("All cars have completed refilling.");
   
		
	}

}
