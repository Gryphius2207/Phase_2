package mypackage;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		try {
			a[8] = 5;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of Bounds");
		}finally {
			System.out.println("The size of the Array is "+a.length);
		}
	}

}
