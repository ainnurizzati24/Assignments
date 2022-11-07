package practice;

import java.util.ArrayList;
import java.util.Collections;

public class smallestNumber {

	public static void main(String[] args) {

		ArrayList<Integer> small = new ArrayList<>();
		
		small.add(12);
		small.add(15);
		small.add(14);
		small.add(13);
		small.add(16);
		
		System.out.println(small);
		 
		Collections.sort(small);
		int smallest = small.get(0);
		
		//find smallest number
		System.out.println("Smallest number:" +smallest);
		
		//find biggest number
		int biggestIndex = (small.size()) - 1;
		System.out.println("Biggest number:" + small.get(biggestIndex));
		
		//find prime number
		for(int i=0; i<small.size(); i++) {
			if(small.get(i) % 2 == 0) {
				System.out.println("Not Prime number");
			} else {
				System.out.println("Prime number");
			}
		}
	}

}
