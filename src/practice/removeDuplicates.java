package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class removeDuplicates {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		
		food.add("rice");
		food.add("grape");
		food.add("soup");
		food.add("rice");
		
		Collections.sort(food);
		System.out.println(food);
		
	    for(int i =0; i<food.size() - 1; i++){
	    		if(food.get(i) == (food.get(i+1))){
	    			food.remove(i+1);
	    			//duplicate characters in string
	    			System.out.println(food.get(i));
	    	}
	    }
	    
	    //remove duplicate elements in an array
	    System.out.println(food);
	    }
		

}
