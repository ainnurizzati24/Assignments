package inheritance;

public class GrandChild extends Child {

	public void methodGrandChild() {
		System.out.println("This is GRANDCHILD METHOD!!!!");
	}
	
	public static void main(String[] args) {
		GrandChild g = new GrandChild();
		g.method1(); //method from parent
		g.method2(); //method from parent
		g.methodforChild(); //method from child

	}

}
