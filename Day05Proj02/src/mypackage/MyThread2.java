package mypackage;

public class MyThread2 extends Thread{
	
	public void run() {
		
		for (int i = 0; i <10000;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 obj = new MyThread2();
		obj.start();

	}

}
