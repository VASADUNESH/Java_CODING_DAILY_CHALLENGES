package DEC_2;

public class COVID_19 {

	public static void main(String[] args) {


		User user1= new User("Ramesh",20,false);
		User user2= new User("Suresh",1,true);
		
		Thread thread1 = new Thread(() ->  {
			try{
				user1.bookDose();
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		});
		
		Thread thread2 = new Thread(() -> {
            try {
                user2.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });
		
		thread1.start();
		thread2.start();

	}

}
