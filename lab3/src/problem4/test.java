package problem4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException, ParseException{
		// TODO Auto-generated method stub
		Employee p = new Employee("Yaslan",1000000,new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2021"),"121");
		Employee p2 = (Employee)p.clone();		
		p.name = "31434";
////		Person p = new Person("Yaslan");
////		Person p2 = (Person) p.clone();
////		p2.name = "dmk";
		System.out.println(p);
		System.out.println(p2);
//		
//
//		Employee p2 = new Employee("Aldo",500000,new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2021"),"122");
//		Employee p3 = new Employee("Miras",800000,new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2020"),"123");
//		Employee p4 = new Employee("Daniil",900000,new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2019"),"124");
//		Manager m = new Manager("Aido",900000,new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2012"),"124",10000);
//		m.add(p);
//		m.add(p2);
//		m.add(p3);
//		m.add(p4);
//		Manager m2 = (Manager)m.clone();
//		System.out.println(m);
//		System.out.println(m2);
//		Vector<Employee> v = new Vector<Employee>();
//		v.add(p);
//		v.add(p2);
//		v.add(p3);
//		Collections.sort(v,new compName());
//		System.out.println(v);
//		//System.out.println(p.compareTo(p2));
////		compName compName = new compName(); not
////		System.out.println(compName.compare(p3,p2));
////		compDate compDate = new compDate();
////		System.out.println(compDate.compare(p,p2));
	}
	
}
