package polymorphism;

public class Addition {

	void sum(int a, int b) {
		int c = a+b;
		System.out.println("Total of a and b is: " + c);
	}
	
	//overloading method 'sum', different amt of parameters
	void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The total of a b and c is: " + d);
	}
	
	void sum(double dd, double ff) {
		double ee = dd + ff;
		System.out.println("The total of dd and ff is: " + ee);
	}
	public static void main(String[] args) {
		Addition obj = new Addition();
		
		obj.sum(1, 2);
		obj.sum(1, 2, 3);
		obj.sum(12.54, 11.22);
	}
}
