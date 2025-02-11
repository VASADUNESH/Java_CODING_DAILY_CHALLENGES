package OCT_18;

class Animal{
	public void makeSound() {
		System.out.println("Generic sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark sound");
	}
}
class Cat{
	public void makeSound() {
		System.out.println("Meow sound");
	}
}



public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal(); a.makeSound();
		
		Dog d = new Dog(); d.makeSound();
		Cat c = new Cat(); c.makeSound();
	}

}
