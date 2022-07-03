package mypackage;

public class CallMethod {
	
	int val = 150;
	
	int operation(int val) {
		this.val = val*10/100;
		System.out.println(val);
		return val;
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethod d = new CallMethod();
		System.out.println(d.val);
		d.operation(100);
		System.out.println(d.val);

	}

}
