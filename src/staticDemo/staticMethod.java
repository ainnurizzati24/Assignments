package staticDemo;

public class staticMethod {

	//regular method
	
	void play() {
		System.out.println("I play TENNIS");
	}
	
	//static method
	static void sleep() {
		System.out.println("I sleep");
	}
	
	public static void main(String[] args) {
		
		staticMethod obj = new staticMethod();
		obj.play(); //need object to call regular method
		
		sleep(); //call static method
	}

}
