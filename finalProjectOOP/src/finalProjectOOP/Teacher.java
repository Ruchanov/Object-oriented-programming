package finalProjectOOP;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class Teacher extends Employee { 
  
	private TeacherDegree teacherDegree; 
    private Vector<Course> courses; 
    private Vector<Message> messages; 
   

    public Teacher(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s,
    		String national, String num, double salary, Date hireDate, TeacherDegree teacherDegree) {
    	super(e_mail, password, name, surname, id, d, g, s, national, num, salary, hireDate);
    	this.teacherDegree = teacherDegree;
    }
    public Vector<Message> getMessages() { 
        return messages; 
    } 
    public Vector<Course> getCourses(){ 
    	return courses; 
    } 
     
    public void addCourses(Course course){ 
    	this.courses.add(course); 
    } 
    public void addMessage(Message message){ 
    	this.messages.add(message); 
    } 
    public TeacherDegree getTeacherDegree(){ 
    	return teacherDegree; 
    } 
    public void setTeacherDegree(TeacherDegree teacherDegree) { 
        this.teacherDegree = teacherDegree; 
    } 
    public void putMark(Course c, Student s, double score, int att) { 
        Mark a = null;
        HashMap<Course, Mark> map = s.getCourses();
        for(HashMap.Entry<Course, Mark> entry : map.map.entrySet()) {
            Course key = entry.getKey();
            Mark value = entry.getValue();

            // do what you have to do here
            // In your case, another loop.
        }
    } 
 
    @Override 
    public boolean equals(Object object) { 
        if (!super.equals(object)) return false; 
        Teacher teacher = (Teacher)object; 
        return this.teacherDegree == teacher.teacherDegree && this.courses.equals(teacher.courses) && this.messages.equals(teacher.messages); 
    } 
    @Override 
    public int hashCode() { 
        return super.hashCode() + teacherDegree.hashCode()+courses.hashCode()+messages.hashCode(); 
    } 
    @Override 
    public String toString() { 
        return "Teacher : "+getName()+" "+getSurname()+" Title : "+getTeacherDegree().toString(); 
    } 
}