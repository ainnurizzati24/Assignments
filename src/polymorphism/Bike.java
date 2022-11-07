package polymorphism;

//parent class
class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

//child class 
class Bike2 extends Vehicle {
	
	void run() {
		System.out.println("Bike is running safely");
	}
	
	public static void main (String args[]) {
		//object for child
		Bike2 obj = new Bike2();
		
		//run child method
		obj.run();
	}
}

