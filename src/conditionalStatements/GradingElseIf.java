package conditionalStatements;

import java.util.Scanner;

public class GradingElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter science marks: ");
		int science = sc.nextInt();
		
		System.out.println("Enter Maths Marks: ");
		int maths = sc.nextInt();
		
		System.out.println("Enter Physics Marks: ");
		int physics = sc.nextInt();
		
		int total = science + maths + physics;
		System.out.println("Your total is:  " + total);
		
		float avg = total/3;
		
		System.out.println("Your average score is: " + avg);
		
		if (avg >= 90) {
			System.out.println("Congrats. You secured 'A' Grade");
		} else if (avg >= 80 && avg <90) {
			System.out.println("You got 'B' Grade");
		} else if (avg >= 70 && avg <80) {
			System.out.println("You secured 'C' Grade. Work harder");
		} else {
			System.out.println("FAIL!");
		}
	}

}
