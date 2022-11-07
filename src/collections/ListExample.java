package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		//creating a list
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		//adding elements to list
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		
		list2.add(12);
		list2.add(13);
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
