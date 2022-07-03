package mypackage;
//call by value changes made to the method are not permanent
class Check{
	//interchange num1 and num2 values 
	void swap(int num1,int num2) {
		int temp1 = num1;
		num1 = num2;
		num2 = temp1;
		System.out.println("Num1 = "+num1+" Num2 = " +num2);
	}
}

public class PrimitiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two primitive data types 
		int num1 = 10, num2 = 20;
		Check obj = new Check();
		System.out.println("Num1 = "+num1+" Num2 = " +num2);
		obj.swap(num1,num2);
		System.out.println("Num1 = "+num1+" Num2 = " +num2);
		
		
	}

}
