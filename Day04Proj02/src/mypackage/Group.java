package mypackage;

import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee(int i, String n) {
        id = i;
        name = n;
    }
    //a method to display data
    void displayData() {
        System.out.println(id + "\t" + name);
    }
}
public class Group {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        //Creating Employee type array with size 5
        Employee arr[] = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter id: ");
            int id = sc.nextInt();

            System.out.println("Enter Name: ");
            String name = sc.next();

            arr[i] = new Employee(id, name);
        }
        System.out.println("\n The Employee data is: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i].displayData();
        }

    }

}