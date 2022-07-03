package mypackage;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods of strings
		System.out.println("Methods of String:");
		
		String s = new String("Hello Folks.!!");
		System.out.println(s.length());
		
		//substring
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		//String Comparison
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.compareTo(s2));
		
		//IsEmpty 
		String s4 = "";
		System.out.println(s4.isEmpty());
		
		//tolowercase
		String s5 = "HELLO";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6 = "Hello";
		String replace = s6.replace("Hello", "Hi");
		System.out.println(replace);
		
		//equals
		String x = "Welcome to JAVA";
		String y = "Welcome to JaVA";
		System.out.println(x.equals(y));
		
		System.out.println("\n");
		System.out.println("Creating String Buffer");
		
		//Creating String Buffer
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Enjoy your learning");
		System.out.println(sb1);
		
		//insert Method 
		sb1.insert(0,"Simpli ");
		System.out.println(sb1);
		
		//replace method
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.replace(0,3,"hEL");
		System.out.println(sb2);
		
		//delete methods
		sb2.delete(0,1);
		System.out.println(sb2);
		
		//String Builder
		System.out.println("\n");
		System.out.println("Creating String Builder");
		StringBuilder sb3 = new StringBuilder("Happy");
		sb3.append(" Learning");
		System.out.println(sb3);
		
		System.out.println(sb3.delete(0,1));
		
		System.out.println(sb3.insert(1,"Welcome"));
		
		System.out.println(sb3.reverse());
		
		//conversion 
		System.out.println("\n");
		System.out.println("Conversion of  String to StringBuilder");
		
		String str = "Hello";
		
		//Conversion of string object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		
		//Conversion of string object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.reverse();
		System.out.println(sbl);
			}
	}


