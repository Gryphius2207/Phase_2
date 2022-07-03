package mypackage;

public class Outer2 {
	
	private String msg = "Inner Classes";
	
	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}
		Inner I = new Inner();
		I.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 obj = new Outer2();
		obj.display();

	}

}
