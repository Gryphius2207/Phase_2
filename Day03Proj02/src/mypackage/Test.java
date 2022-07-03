package mypackage;

public class Test {
	//instance variable 
	static int x = 55;
	//parameterized constructor

	 Test(int a) {
		Test.x = a;
	}
	 //static method accessing x values
	 static void access() {
		 System.out.println("X ="+x);
	 }

}
