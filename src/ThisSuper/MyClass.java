package ThisSuper;

class MyParent{
	
	String name="This is parent class instance variable";
}

public class MyClass extends MyParent {

	String name="This is instance variable";
	
	void someMethod() {
		String name="This is local variable";
		int b=10;
		
		System.out.println(name);
		System.out.println(b);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		obj.someMethod();
	}

}
