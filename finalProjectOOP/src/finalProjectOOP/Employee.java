package finalProjectOOP;

import java.util.Date;
import java.util.Vector;

public class Employee extends User {
	private double salary;
	private Vector<Message> messages;
	private Date hireDate;
//	private Vector<Book>books;
	  
	public Employee(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s, String national, String num, double salary, Date hireDate) {
        super(e_mail, password, name, surname, id, d, g, s, national, num);
        this.salary = salary;
        this.hireDate=hireDate;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Vector<Message> getMessage(){
      return messages;
    }
    
//    public boolean equals(Object object) {
//        if (object.getClass() != this.getClass()) return false;
//        Employee employee = (Employee) object;
//        return this.salary == employee.salary;
//    }
    public int hashCode() {
        return super.hashCode() + (int) salary;
    }
    public String toString() {
        return super.toString() + "/nsalary: " + this.salary + "/nhire date: " + this.hireDate;
    }

	}