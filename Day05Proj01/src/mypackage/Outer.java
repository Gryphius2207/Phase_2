package mypackage;

public class Outer {
	private String msg = "Welcome to Java Training";
	
	class Inner {
		void hello() {
			System.out.println(msg +", Let's start learning");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.hello();

	}

}
