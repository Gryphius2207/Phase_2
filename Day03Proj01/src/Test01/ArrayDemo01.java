package Test01;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] marks = {50,60,70,80,90};
		int[] marks;
		marks = new int[5];
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;
		marks[3] = 80;
		marks[4] = 90;
		System.out.println("Size of array: " + marks.length);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

}
