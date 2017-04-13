// Exercise 5-6

public class Dog2 {
	
	static void bark() {
		System.out.println("This dog barks!!");
	}// end of bark method
	static void bark(char c, String s) {
		System.out.print("This dog " + s + "!! ");
		System.out.println("And his name starts with " + c + "!!");
	}// end of bark method with character argument
	static void bark(String s, char c) {
		System.out.print("This dog's name starts with " + c + "!! ");
		System.out.println("This dog " + s + "!!");
	}// end of bark method with string argument

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bark();
		bark('C', "howls");
		bark("wuffs", 'R');
	}// end of main method

}// end of Dog2 class
