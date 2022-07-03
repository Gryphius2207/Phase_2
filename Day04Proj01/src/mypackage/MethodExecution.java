package mypackage;


public class MethodExecution {
	public int multiplyNumbers (int a,int b) {
		int z =a*b;
		return z;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExecution b =new MethodExecution();
		int ans = b.multiplyNumbers(10,5);
		System.out.println(ans);

	}

}
