package finalProjectOOP;

import java.util.HashMap;
import java.util.Vector;

public class Course {
	private final String ID;
	private String name;
	private String description;
	private Faculty faculty;
	private int creditsAmount;
	private Vector<Lesson> lessons;
	private HashMap<Student, Mark> marks;
	private Vector<Teacher> teachers;
	CourseType type;
	Course(String ID,String name, String description, Faculty faculty, int credit, CourseType type){
		this.creditsAmount = credit;
		this.description = description;
		this.faculty = faculty;
		this.name = name;
		this.ID = ID;
		
	}
	
	public boolean equals(Object o) {
		if(o.getClass() != this.getClass()) return false;
		Course p = (Course) o;
		return this.ID.equals(p.ID);
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public Faculty getFaculty() {
		return this.faculty;
	}
	public int getCredits() {
		return this.creditsAmount;
	}
	public Vector<Lesson> getLessons(){
		return this.lessons;
	}
	public Vector<Teacher> getTeachers(){
		return this.teachers;
	}
	public String toString() {
		return this.ID + ", " + this.name + "/n" + this.getDescription();
	}
}
