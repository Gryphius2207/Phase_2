package Test01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//to accept the marks of a student
//from the keyboard and find total and average of marks
public class ArrayDemo02 {

	public static void main(String[] args) {
		// TO accept data from keyboard
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//how many subjects
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Subjects");
		int n = scanner.nextInt();
		//int n = Integer.parseInt(reader.readLine());
		
		//To create 1D marks array
		int[] marks = new int[n];
		
		//store elements into the Array 
		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks:");
			marks[i] = scanner.nextInt();
		}
		//finding total
		int tot = 0;
		for (int i = 0; i < n; i++) {
			tot += marks[i];
		}
		//displaying total marks
		System.out.println(tot);
		
		//finding percentage
		float percent = (float) tot / n;
		System.out.println(percent);
	}

}
