package finalProjectOOP;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Student extends User{
	private String speciality;
	private int year;
	private Degree degree;
	private Faculty faculty;
	private HashMap<Course, Mark> courses;
	//private transcript ne znau che delat s etim poka
//	private Vector<Book> books;
	Double gpa;
	Vector<Organization> organizations;
	Student(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s, String national, String num, String spec, int year, Degree degree,Faculty f){
		super(e_mail, password, name, surname, id, d, g, s, national, num);
		this.speciality = spec;
		this.degree = degree;
		this.year = year;
		this.faculty = f;
		
	}
	public HashMap<Course, Mark> getCourses(){
		return courses;
	}
	
}
