package interfaceDemo;

interface TwoLegged {
	void methodLeg();
}

public class Dog implements Animal {

	public void methodAnimal() {
		System.out.println("This is dog");
	}
	
	public void methodLeg() {
		System.out.println("It has two legs");
	}
	
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.methodAnimal();
		obj.methodLeg();
	}
}
