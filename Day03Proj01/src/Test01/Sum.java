package Test01;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,sum;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Numeber: ");
			x = sc.nextInt();
			System.out.println("Enter Second Numeber: ");
			y = sc.nextInt();
		}
		sum = x+y;
		System.out.println("The sum of two Values:"+ sum);
	}
}
