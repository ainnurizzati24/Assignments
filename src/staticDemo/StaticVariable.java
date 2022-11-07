package staticDemo;

public class StaticVariable {
	
	static int x=455; //static variable
	int y=56565; //instance variable
	
	public static void main(String[] args) {
		System.out.println(StaticVariable.x); //can only call static variable like this, no need object
		
		StaticVariable st = new StaticVariable();
		System.out.println(st.y); // need object to call this variable
	}

}
