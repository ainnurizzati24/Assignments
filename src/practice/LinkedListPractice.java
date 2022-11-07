package practice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList<>();
		
		//add
		numbers.add(232);
		numbers.add(45655);
		numbers.add(1);
		numbers.add(88);
		
		System.out.println(numbers);
		
		//add at index
		numbers.add(1, 12);
		System.out.println(numbers);
		
		numbers.forEach(a-> {
			System.out.println(a);
		});
	}

}
