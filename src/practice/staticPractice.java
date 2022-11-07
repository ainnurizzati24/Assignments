package practice;

//parent to use super
class Parent{
	String practice = "Trying..."; //instance variable
}

public class staticPractice extends Parent {

	// static variable
	static String hello = "Hello!";
	
	//static method
	static void code() {
		System.out.println("I code");
	}
	
	//child instance variable
	String practice = "Trying again...";
	
	//method to use this n super
	void tryMethod() {
		
		String practice = "Trying again n again..."; //local variable
		
		System.out.println(super.practice);
		System.out.println(practice);
	}
	
	public static void main(String[] args) {
		
		System.out.println(hello);
		code(); //call static method
		
		//to print the this n super
		staticPractice obj = new staticPractice();
		obj.tryMethod();
	}
}
