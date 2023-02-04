package problem2;

import java.util.Vector;

public class test {

	public static void main(String[] args) {
//		Vector<Person> v = new Vector<>();
//		Person p = new Student("a","b","oop",12,2.3);
//		Person p2 = new Student("a","b","oop",12,2.3);
//		v.add(p);
//		v.add(p2);
//		for(Person person : v) {
//			person.toString();
//		}
	    String str = "Name";
	    String str1 = new String("Name");
	    
	    if (str.equals(str1))
	        System.out.println("true");
	    else
	        System.out.println("false");

	    if (str == str1)
	        System.out.println("true");
	    else
	        System.out.println("false");
	    
	    System.out.println(str.hashCode());
	    System.out.println(str1.hashCode());
	}
}
