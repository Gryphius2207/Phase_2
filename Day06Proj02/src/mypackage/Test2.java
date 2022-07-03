package mypackage;

class MyException extends Exception {
	String str1;
	MyException(String str2){
		str1 = str2;
	}
	public String toString(){
		return("My Exceptin Occurred: "+str1);
	}
}
public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println("\nStarting of try Block");
			//I am throwing custom exception using throw
			throw new MyException("This is my error message");
		}catch(MyException e){
			System.out.println("Catch Block");
			System.out.println(e);
			
		}
	}
}
