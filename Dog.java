//Exercise 5-5

public class Dog {
	
	static void bark() {
		System.out.println("This dog barks!!");
	}// end of bark method
	static void bark(char c) {
		System.out.println("This dog's name starts with " + c + "!!");
	}// end of bark method with character argument
	static void bark(String s) {
		System.out.println("This dog " + s + "!!");
	}// end of bark method with string argument
	static void bark(int i) {
		System.out.println("This dog barks "+ i + " times!!");
	}// end of bark method with integer argument
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bark();
		bark('R');
		bark("howls");
		bark(6);
	}// end of main method

}// end of class Dog
