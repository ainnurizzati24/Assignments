package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(757);
		list.add(453.22);
		list.add("mango");
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		
		
	}

}
