package practice;

public class primeNumber {

	public static void main(String[] args) {
		
		int [] age = {20,21,25,19};
		
		for(int i=0; i<age.length; i++) {
			if(age[i] % 2 == 0) {
				System.out.println("Not Prime number");
			} else {
				System.out.println("Prime number");
			}
		}
	}

}
