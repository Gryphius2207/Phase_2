package mypackage;

class Person{
	private String name;
	private int age;
	
	//mutator methods to store data
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//accessor methods to read data
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("Hari Prasadh");
		p.setAge(23);
		
		//access data from the object
		System.out.println("name = "+p.getName());
		System.out.println("age = "+p.getAge());

	}

}
