package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> sports = new HashSet<>();
		sports.add("Tennis");
		sports.add("Baseball");
		sports.add("Kho-Kho");
		sports.add("Golf");
		
		System.out.println(sports);
		sports.add("Kho-Kho"); //duplicate value
		System.out.println(sports);
		int ts = sports.size(); //to find size
		System.out.println(ts);
		
	}

}
