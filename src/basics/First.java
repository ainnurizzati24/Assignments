package basics;

public class First { //class created
	
	//method creation
	
	public void mymethod() {
		//this is a block of code/method body (the whole inside curly braces)
		System.out.println("This is my first method logic...");
	}

	public void mymethod2() {
		System.out.println("My second method logic....");
	}
	
	public static void main(String[] args) {
		System.out.println("This is my first JAVA program");
		
		//object creation
		
		First abc = new First();
		abc.mymethod();
		abc.mymethod2();
		
	}
}
