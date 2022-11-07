package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[]  args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ain");
		names.add("Bob");
		names.add("Po");
		names.add("Mi");
		
		//iterator
		Iterator itr = names.iterator();
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		// for each loop
		for(String nameLists:names) {
			System.out.println(nameLists);
		}
		
		//get n set
		System.out.println(names);
		System.out.println(names.get(1));
		names.set(1, "Bobby");
		System.out.println(names);
		
		//sort
		Collections.sort(names);
		System.out.println(names);
		
		//for loop
		for(int i=0;i<names.size();i++)  
        {  
         System.out.println(names.get(i));     
        } 
		
		//forEach() method
		 names.forEach(a->{  
             System.out.println(a);  
           });  
	}
}
