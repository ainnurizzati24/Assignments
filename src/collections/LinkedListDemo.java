package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> sports = new LinkedList<>();
		
		sports.add("tennis");
		sports.add("golf");
		
		System.out.println(sports);
		sports.add(0, "kho-kho");
		System.out.println(sports);
		sports.addLast("hockey");
		System.out.println(sports);
	}

}
