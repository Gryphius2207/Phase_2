package mypackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating array list
		System.out.println("Array List: ");
		ArrayList city = new ArrayList();
		city.add("Bengaluru");
		city.add("Trichy");
		city.add("Chennai");
		city.add(2207);
		city.add(12.56);
		System.out.println(city);
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vect = new Vector<Integer>();
		vect.addElement(22);
		vect.addElement(17);
		vect.addElement(98);
		System.out.println(vect);
		
		//creating linked list
		System.out.println("\n Linked List");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Hari");
		names.add("karthi");
		names.add("Myth");
		names.add("Sneha");
		names.add("Sam");
		//System.out.println(names);
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//creating hashset
			System.out.println("\n Hashset");
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(101);
			set.add(102);
			set.add(103);
			set.add(104);
			set.add(101);
			set.add(102);
			System.out.println(set);
			
			//creating Linked hashset 
			System.out.println("\n LinkedHashSet");
			LinkedHashSet<Integer> set2 =new LinkedHashSet<Integer>();
			set2.add(101);
			set2.add(104);
			set2.add(103);
			set2.add(102);
			set2.add(105);
			set2.add(101);
			System.out.println(set2);
			
		}
		
		
	}
	
	

}
