package mypackage;

class Test{
	//x is instance variable 
	private int x;
	Test(){
		this(55);//calls present class parameterized constructor
		this.access();
	}
	//parameterized constructor
	Test (int x){
		this.x = x;
	}
	//method
	void access() {
		System.out.println("x= " +x);
	}
}
public class thisDemo {
	public static void main(String[] args) {
		Test t = new Test();
		
	}

}
