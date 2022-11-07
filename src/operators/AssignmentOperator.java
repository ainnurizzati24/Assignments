package operators;

public class AssignmentOperator {
	// = += -= *= /= %=
	public static void main(String[] args) {
		
		
		int n1 = 10, n2 = 20; //n2 value is 20
		
		n2 = n1; //n2 value is 10
		System.out.println(n2); //10
		
		n2 += n1; // 10 + 10 = 20
		System.out.println(n2); // 20
		
		n2 -= n1; // 20-10=10
		System.out.println(n2); // 10
		
		n2 *=n1; // 10 * 10 = 100
		System.out.println(n2); // 100

		n2 /= n1; // 100 / 10 = 10
		System.out.println(n2); // 10
		
		n2 %= n1; // 10 % 10 = 0
		System.out.println(n2); // 0
	}

}
