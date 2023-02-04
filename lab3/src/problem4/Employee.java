package problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	
	double salary;
	Date date;
	String insuranceNumber;
	public Employee(String name,double salary,Date d,String insuranceNumber){
		super(name);
		this.salary = salary;
		this.date = d;
		this.insuranceNumber = insuranceNumber;
	}
	public String toString() {
		return super.toString() + ". I began working in " + date + " and my salary is " + salary + " with insurance number " + insuranceNumber; 
	}
	public void setName(String s) {
		this.name = s;
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Employee p = (Employee) o;
		return this.insuranceNumber.equals(p.insuranceNumber) && this.date == p.date && this.salary == p.salary;
	}
	public int compareTo(Employee e) {
		if(this.salary > e.salary) return 1;
		else if(this.salary < e.salary) return -1;
		return 0;
	}
	public Object clone() throws CloneNotSupportedException{
		Employee p = (Employee) super.clone();
		p.date = (Date) date.clone();
//		p.insuranceNumber = (String) insuranceNumber.clone();
//		p.name = (String) name.clone();
//		p.salary = salary.clone();
		return p;
	}
	
	
}
