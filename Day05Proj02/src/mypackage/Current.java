package mypackage;
public class Current {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find the current thread");
		Thread t = new Thread();
		System.out.println("Crrent thread: " + t.currentThread().getName());
		

	}

}
