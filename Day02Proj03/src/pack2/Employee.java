package pack2;

public class Employee {
	private void display() {
		System.out.println("Private access modifier");
	}
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.display();
	}
}

	
	
