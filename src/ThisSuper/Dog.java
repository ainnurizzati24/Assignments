package ThisSuper;

class Animal {
	String color="WHITE...PARENT CLASS"; //parent class instance variable
}

public class Dog extends Animal {
	
	String color="BLACK...CHILD CLASS"; //child class instance variable
	
	void printcolor() {
		String color="BLACK...CHILD CLASS local"; //local variable
		
		System.out.println(color); //current class local variable
		System.out.println(this.color); //current class instance variable
		System.out.println(super.color); //parent class
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.printcolor();
	}

}
