package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> numbers = new LinkedList<>();
		
		numbers.offer(101);
		numbers.offer(102);
		numbers.offer(103);
		numbers.offer(104);
		numbers.offer(105);
		numbers.offer(106);
		
		System.out.println(numbers);
		int somename = numbers.peek();
		System.out.println("Head of the Queue is : " +somename);
		int removednumber = numbers.poll();
		System.out.println("Removed number using poll method is : " +removednumber);
		System.out.println(numbers);
		System.out.println(numbers.element());
	}

}
