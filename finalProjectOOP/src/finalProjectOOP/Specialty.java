package finalProjectOOP;

import java.io.Serializable;
import java.util.Objects;
import java.util.Vector;

public class Specialty implements Serializable{ 
	    private String name; 
	    private Vector<Course> courses; 
	    public Specialty(String name) { 
	        this.name = name; 
	        courses = new Vector<Course>(); 
	    } 
	    public String getName() { 
	        return this.name; 
	    } 
	    public void setName(String name) { 
	        this.name = name; 
	    } 
	    public Vector<Course> getCourses() { 
	        return courses ; 
	    } 
	    public void addCourse(Course course) { 
	        courses.add(course); 
	    } 
	    public void printCourses() { 
	        for (int i = 0; i < courses.size(); i++) 
	            System.out.println(i + 1 + ". " + courses.get(i)); 
	    } 
	    @Override 
	    public boolean equals(Object object) { 
	        if (object == this) 
	            return true; 
	        if (object == null) 
	            return false; 
	        if ( ! (object instanceof Specialty)) 
	            return false; 
	        Specialty specialty = (Specialty)object; 
	        if (this.name.equals(specialty.name) && this.courses.equals(specialty.courses)) 
	            return true; 
	        return false; 
	    } 
	    @Override 
	    public int hashCode() { 
	        return Objects.hash(this); 
	    } 

	    public String toString() { 
	        return "Specialty Name: " + name; 
	    } 
	}