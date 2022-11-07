package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		//object creation to call method
		Animal a = new Animal();
		Dog d = new Dog();
		Pig p = new Pig();
		
		d.sound(); //calling child sound method
		a.sound(); //calling parent sound method
		p.sound(); // calling another child pig method

	}

}
