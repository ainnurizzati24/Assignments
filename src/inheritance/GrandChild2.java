package inheritance;

public class GrandChild2 extends Child2 {

	public void methodGrandChild2() {
		System.out.println("This is GRANDCHILD 2 METHOD!!!!");
	}
	
	public static void main(String[] args) {
		
		GrandChild2 gc2 = new GrandChild2();
		
		gc2.method1();
		gc2.method2();
		gc2.methodChild2();
	}

}
