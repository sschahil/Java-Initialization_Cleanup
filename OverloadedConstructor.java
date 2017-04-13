//Exercise 5-4

public class OverloadedConstructor {
	
	OverloadedConstructor() {
		System.out.println("You are in the default constructor.");
	}// end of overloaded constructor with no argument
	
	OverloadedConstructor(String s) {
		System.out.println("You are in the " + s + " constructor.");
	}//end of overloaded constructor with string argument
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OverloadedConstructor();
		new OverloadedConstructor("Overloaded");
	}//end of main method

}// end of class OverloadedConstructor
