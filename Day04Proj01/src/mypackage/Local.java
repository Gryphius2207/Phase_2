package mypackage;

class Sample {
	//x is a instance variable 
	private int x;
	//a is a local variable 
	void modify (int x) {
		System.out.println("x= " +x);
		this.x = x;
	}
	//we can access x, but not a 
	void access () {
		System.out.println("x= " +x);
		
	}
}
public class Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.modify(10);
		s.access();

	}

}
