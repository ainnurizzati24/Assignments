package garbageCollector;

public class garbageDemo {
	//nullifying the reference to another object...anonymous object
	public void finalize() {
		System.out.println("unreferenced object garbage collected");
	}
	
	public static void main(String[] args) {
		
		garbageDemo gd = new garbageDemo();
		gd=null; //nullifying 
		
		garbageDemo gd2 = new garbageDemo();
		gd=gd2; //referencing to another
		
		//anonymous object
		new garbageDemo(); // no name 
		
		System.gc();
	}

}
