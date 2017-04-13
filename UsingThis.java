//Exercise 5-8
public class UsingThis {
	
	UsingThis method1() {
		System.out.println("You are in method one!!");
		return this;
	}// end of method1 method
	
	void method2() {
		method1(); // calling method1 without using this
		this.method1(); // calling method2 using this
	}//end of method2 method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingThis().method2(); 
	}// end of main method

}// end of UsingThis class
