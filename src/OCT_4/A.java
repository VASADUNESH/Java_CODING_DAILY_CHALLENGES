package OCT_4;

public class A {
	private int data =15;
	
	public A(){
		B b = new B(this);
		b.display();
	}
	public void show() {
	     System.out.println("instance variable data in A = " + data);
	}
}
