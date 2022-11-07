package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Paris");
		list.add("New York");
		list.add("Copenhagen");
		list.add("KL");
		list.add("New Delhi");
		list.add("12345");
		list.add("123");
		
		list.add(2, "Canberra");
		list.add(6, "Stockholm"); //place
		list.set(5, "Mumbai"); //replace
		
		System.out.println(list);
		
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Malaysia");
		countries.add("Denmark");
		countries.add("France");
		System.out.println(countries);
		countries.addAll(3, list);
		System.out.println("After merging list with countries: " + countries);
		
		
		int length = list.size();
		System.out.println(length);
		boolean c = list.contains("melbourne");
		System.out.println(c );
	}
}
