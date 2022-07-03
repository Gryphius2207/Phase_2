package Test01;

public class ArrayDemo03 {
	public static void main(String[] args) {
		int marks [][] = {{50,60,70,80,90},
				{22,33,44,55,66},{87,87,97,55,34}};
		//int marks [][] = new int[3][5];
		//printing array elements
		//System.out.println(marks.length);
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");				
			}
			System.out.println();
		}
	}

}
