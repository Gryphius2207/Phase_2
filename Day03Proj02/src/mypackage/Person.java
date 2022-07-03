package mypackage;

public class Person {
	
	//Properties of a Person-variables
	private String name;
	private int age;
	//default constructor
	Person(){
		name = "Hari Prasadh22";
		age = 23;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//actions done by a Person
	void talk() {
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}
	void eat() {
		
	}
	
}
