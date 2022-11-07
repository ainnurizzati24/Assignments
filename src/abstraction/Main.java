package abstraction;

public class Main {

	public static void main(String[] args) {
		
//		Animal a = new Animal();
		Dog d = new Dog();
		
		d.methodA(); //calling abstract method by using child class object
		d.regularMethod();
	}

}
