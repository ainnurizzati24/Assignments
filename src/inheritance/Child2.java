package inheritance;

public class Child2 extends Parent{

	public void methodChild2() {
		System.out.println("This is child2 method");
	}
	
	public static void main(String[] args) {

		Child2 c2 = new Child2();
		c2.method1();
		c2.method2();
	}

}
