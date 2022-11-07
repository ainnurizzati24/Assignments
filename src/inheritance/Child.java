package inheritance;

public class Child extends Parent { //inherited parent class

	public void methodforChild() {
	System.out.println("This is CHILD CLASS method for my grandchild");
	}
	
	public static void main(String[] args) {

		Child c = new Child(); //object created to call any method
		c.method1(); //calling parent method 
		c.method2(); //calling 2nd parent method
	}

}
