package main;

public class MainMethod {

	void method1() {
		System.out.println("This is a regular method");
	}
	
	public static void main() {
		System.out.println("This is method in main");
	}
	
	public static void main(String[] martin) { //execution starts from here
		//public -- access modifer -- access to all
		//static -- call without any object
		//void -- return type -- it doesnt return any value
		//main --name of method
		//String[] -- array of String type arguments
		//args -- just a parameter name
		System.out.println("This is main method");
		MainMethod m = new MainMethod();
		m.method1();
		main();
	}

}
