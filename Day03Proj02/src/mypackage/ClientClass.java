package mypackage;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee eobj = new Employee();
		//eobj.displayDetails();
		//Bank obj = new Bank();
		//obj.display_to_clerk();
		Person jay = new Person();
		System.out.println("Hash Code: " + jay.hashCode());
		jay.name = "Hari Prasadh";
		jay.age = 23;
		jay.talk();
		
		Person jay2 = new Person();
		jay2.name = "Hari Prasadh1";
		jay2.age = 25;
		jay2.talk();
	}

}
