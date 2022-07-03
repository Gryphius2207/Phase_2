package mypackage;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("temp");
		}catch (MyException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}

}
