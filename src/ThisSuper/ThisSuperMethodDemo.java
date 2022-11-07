package ThisSuper;

class Parent{
	void play() {
		System.out.println("Parent play golf");
	}
}

public class ThisSuperMethodDemo extends Parent {

	void play() {
		System.out.println("I play tennis");
	}
	
	void all() {
		this.play();
		super.play();
	}
	
	public static void main(String[] args) {
		ThisSuperMethodDemo obj = new ThisSuperMethodDemo();
		obj.all();
	}

}
