package collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> rollno = new PriorityQueue<>(8, Collections.reverseOrder());
		
		rollno.offer(205);
		rollno.offer(1);
		rollno.offer(12);
		rollno.offer(345);
		rollno.offer(3123);
		System.out.println(rollno);
		while(rollno.size()>0) {
			System.out.println(rollno.remove() + " ");
		}
		
		int s = rollno.size();
		while(s>0) {
			System.out.println(rollno.remove() + " ");
		}
	}

}
