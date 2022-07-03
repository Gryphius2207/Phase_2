package mypackage;

public class Bank {
	
	private int accno;
	private String name;
	private float balance;
	private float profit;
	private float loan;
	
	public void display_to_clerk() {
		System.out.println("Accno: " + accno);
		System.out.println("Name = "+name);
		System.out.println("Balance: " + balance);
	}

}
