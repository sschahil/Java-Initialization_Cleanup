
public class ThisConstructor {
	
	ThisConstructor() {
		this("Twilight");
		System.out.println("You are in the default constructor.");
	}// end of constructor with no argument
	
	ThisConstructor(String s) {
		System.out.println("You are in the " + s + " zone.");
	} // end of constructor with string argument
	
	public static void main(String[] args) {
		new ThisConstructor();
	}// end of main method
	
}// end of class ThisConstructor
