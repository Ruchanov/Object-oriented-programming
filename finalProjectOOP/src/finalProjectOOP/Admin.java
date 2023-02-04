package finalProjectOOP;

import java.util.Date;

public class Admin extends Employee{

	public Admin(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s,
			String national, String num, double salary, Date hireDate) {
		super(e_mail, password, name, surname, id, d, g, s, national, num, salary, hireDate);
		// TODO Auto-generated constructor stub
	}
	public void addUser(User a) {
		DataBase.users.add(a);
	}
	
	public void createStudent(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s, String national, String num, String spec, int year, Degree degree,Faculty f) {
		Student temp = new Student(e_mail, password, name, surname, id, d, g,s, national, num,spec, year, degree,f);
		addUser(temp);
	}
	public void createAdmin(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s,String national, String num, double salary, Date hireDate) {
		Admin temp = new Admin(e_mail, password, name, surname, id, d, g, s, national, num, salary, hireDate);
		addUser(temp);
	}
	public void createTeacher(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s,String national, String num, double salary, Date hireDate) {
		Teacher temp = new Teacher(e_mail, password, name, surname, id, d, g, s, national, num, salary, hireDate, null);
		addUser(temp);
		DataBase.teachers.add(temp);
	}
}
