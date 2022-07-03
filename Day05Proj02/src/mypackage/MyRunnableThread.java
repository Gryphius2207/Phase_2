package mypackage;

public class MyRunnableThread implements Runnable{
	
	public static int mycount= 0;
	public MyRunnableThread() {
		
	}
	public void run() {
		while(MyRunnableThread.mycount<10) {
			try {
				System.out.println("Expl Thread: "+(++MyRunnableThread.mycount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				// TODO Auto-generated catch block
				System.out.println("Ex in thread:"+iex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main thThread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		
		while(MyRunnableThread.mycount<=10){
			try {
				System.out.println("Main Thread "+(++MyRunnableThread.mycount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				// TODO Auto-generated catch block
				System.out.println("Ex in thread:"+iex.getMessage());
			}
			
		}
		}

	}


