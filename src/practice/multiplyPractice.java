package practice;

import java.util.Scanner;

public class multiplyPractice {

	static void getNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int first = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int second = sc.nextInt();
		
		int total = first * second;
		System.out.println("Total: " + total);
	}
	
	public static void main(String[] args) {
		
		getNumber(); //call method static
		
	}
	
}
