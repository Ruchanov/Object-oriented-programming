package finalProjectOOP;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

import problem4.Employee;

public abstract class User implements Cloneable{
	private final String e_mail;
	private String password;
	private String name, surname;
	private final String id;
	private Date date_of_birth;
	private Gender gender;
	private Status family_status;
	private String national;
	private String phone_number;
	private Vector<Book> books;
	User(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s, String national, String num){
		this.e_mail = e_mail;
		this.date_of_birth = d;
		this.family_status = s;
		this.gender = g;
		this.id = id;
		this.name = name;
		this.national = national;
		this.password = password;
		this.phone_number = num;
		this.surname = surname;
		//DataBase.addToVectorOfUsers(this);
	}
	User() {
		this.e_mail = "";
		this.id = "";
		
	}
	public void setPassword(String oldPassword, String newPassword) {
		if(oldPassword.equals(this.password)) {
			this.password = newPassword;
		}
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setFamilyStatus(Status s) {
		this.family_status = s;
	}
	public void setPhone(String s) {
		this.phone_number = s;
	}
	public String getpassword() {
		return this.password;
	}
	public String getE_mail() {
		return this.e_mail;
	}
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public Object clone() throws CloneNotSupportedException{
		User p = (User) super.clone();
		p.date_of_birth = (Date) date_of_birth.clone();
		return p;
	}
	public static void logout(User u) {
		User temp = null;
		u = temp;
	}
	public boolean equals(Object o) {
		if(o.getClass() != this.getClass()) return false;
		User p = (User) o;
		return this.id.equals(p.id);
	}
//	public boolean login(String e_mail, String password) {
//		if(e_mail.equals(this.e_mail) && password.equals(this.password)) {
//			return true;
//		}
//		return false;
//	}

	public String toString(){ 
		return this.name + this.surname + "/ndate of birth: " + this.date_of_birth + "/ngender: " + this.gender + "/nfamily status: " + this.family_status + "/n national: " + this.national + "/nphone number " + this.phone_number + "/ne_mail: " + this.e_mail ; 
	}
	
}
