package finalProjectOOP;

import java.util.Date;
import java.util.HashSet;
import java.util.Vector;

public class Manager extends Employee { 
	 
	 public Manager(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s,
			String national, String num, double salary, Date hireDate) {
		super(e_mail, password, name, surname, id, d, g, s, national, num, salary, hireDate);
		// TODO Auto-generated constructor stub
	}
	 public boolean addCourseForRegister(Specialty specialty, Course course) {
		 if(specialty.getCourses().contains(course)) return false;
		 specialty.addCourse(course);
		 return specialty.getCourses().contains(course);
	 }
	 public HashSet<Teacher> viewTeacherInformation() { 
	        return DataBase.teachers;
	    } 
	 public HashSet<Student> viewStudentInformation() { 
	        return DataBase.student; 
	    }
	    @Override 
	    public boolean equals(Object object) { 
	        return super.equals(object); 
	    } 
	    @Override 
	    public int hashCode() { 
	        return super.hashCode(); 
	    } 
	 
	    @Override 
	    public String toString() { 
	        return "Manager : "+getName()+" "+getSurname(); 
	    } 
	  
}