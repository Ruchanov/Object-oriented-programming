package problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{
	double bonus;
	Manager(String name, double salary, Date d, String insuranceNumber, double b) {
		super(name, salary, d, insuranceNumber);
		this.bonus = b;
		// TODO Auto-generated constructor stub
	}

	public Vector<Employee> v = new Vector<Employee>();
	Employee er = new Employee("ernat",23.5,new Date(12-12-2012),"1213");
	public void add(Employee e) {
		v.add(e);
	}
	public String toString() {
		return super.toString() + "bonus is " + bonus;
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Manager p = (Manager) o;
		return this.bonus == p.bonus;
	}
	public int compareTo(Manager e) {
//		if(this.salary > e.salary) return 1;
//		else if(this.salary < e.salary) return -1;
		if(super.compareTo((Employee) e) != 0){
			return super.compareTo((Employee) e);
		}
		else {
			if(this.bonus > e.bonus) return 1;
			if(this.bonus < e.bonus) return -1;
		}
		return 0;
	}
	public Object clone() throws CloneNotSupportedException{
		Manager m = (Manager)super.clone();
		m.v = (Vector<Employee>) m.v.clone();
		return m;
	}
	
}
