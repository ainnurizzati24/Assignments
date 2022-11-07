package interfaceDemo;

public class Bee implements Apple{

	@Override
	public void method1() { //from interface A
		System.out.println("This is an interface method1...");
	}

	public void method2() { //from interface A
		System.out.println("This is an interface method2...");
	}

	void thanks() { //my own method
		System.out.println("This is my own method...thanks interface Apple");
	}
	
	public static void main(String[] args) {
		Bee obj = new Bee();
		obj.method1();
		obj.method2();
		obj.thanks();
	}
}
