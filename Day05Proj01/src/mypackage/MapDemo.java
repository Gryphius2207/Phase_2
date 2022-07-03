package mypackage;

import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Hari");
		hm.put(2,"Prasadh");
		hm.put(3,"HS");
		
		System.out.println("\n THe elements of the HashMap are: ");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		
		ht.put(4, "Karthik");
		ht.put(5, "Salman");
		ht.put(6, "Ajit");
		ht.put(7, "Naim");
		
		System.out.println("\n THe elements of the Hashtable are: ");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
		//TreeMap
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Kumar");
		map.put(9, "Soni");
		map.put(10, "sanjay");
		map.put(11, "Shubaan");
		
		System.out.println("\n THe elements of the TreeMap are: ");
		for(Map.Entry o:map.entrySet()) {
			System.out.println(o.getKey()+" "+o.getValue());
		}
		
	}
	
}
