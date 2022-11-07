package basics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int [] age = {20,21,25,19};
		System.out.println(age); //this will print the memory instead 
		System.out.println(age[3]); //print like this instead
		System.out.println(age.length); //print the length (ready-made method)
		
		//method #1
		String [] namesofStudents = {"ain", "nur", "ali"};
		
		System.out.println(namesofStudents[2]);
		
		//method #2
		String [] namesofStudents2 = new String [10];
		namesofStudents2[0] = "ricky";
		namesofStudents2[1] = "lucky";	
		namesofStudents2[2] = "sachin";
		
		System.out.println(namesofStudents2[2]);
		
	}

}
