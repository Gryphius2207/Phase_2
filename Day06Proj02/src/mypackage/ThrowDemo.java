package mypackage;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45 , b= 0, rs;
		try {
			if(b==0)
				throw(new ArithmeticException("Can't Divide by Zero"));
			else {
				rs = a/b;
				System.out.println("\n\tThe Result is: "+rs);
			}
		}catch(ArithmeticException e) {
			System.out.println("\n\tError: "+e.getMessage());
		}
		System.out.println("\n\tEnd of Program");
	}

}
