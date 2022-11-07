package conditionalStatements;

import java.util.Scanner;

public class IfElseConcept {

	public static void main(String[] args) {
		//if - else conditional statement
		
		//predefined age - if else
//		int age = 25;
//		System.out.println("Predefined" + age);
//		if (age > 18) {
//			//logic
//			System.out.println("Ok this guy is eligible to vote");
//		} else {
//			System.out.println("You are minor so not eligible to vote");
//		}
				
		//enter the age by using scanner - if else
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of candidate: ");
		int age2 = sc.nextInt();
		
		if (age2 >= 18 && age2 <= 100) {
			//logic
			System.out.println("Ok this guy is eligible to vote");
		} else if (age2 > 100) {
			System.out.println("You are not eligible, too old");
		} 
		else {
			System.out.println("You are minor so not eligible to vote");
		}
			
	}
}


