package problem4;
import practice2.Student;

import java.util.List;
import java.util.Vector;

//import practice2.Student;
public class GradeBook {
	Course c;
	Vector<Student> v = new Vector<>();
	
	GradeBook(Course c){
		this.c = c;
	}
	void addStudent(Student s) {
		v.add(s);
	}
	public String displayMessage() {
		return "Welcome to the grade book for " + this.c + "!\nPlease, input grades for the students:\n";
	}
	public String displayGradesDistribution() {
		String res = "";
		String[] a = {"00-09: ", "10-19: ", "20-29: ", "30-39: ", "40-49: ", "50-59: ", "60-69: ", "70-79: ", "80-89: ", "90-99: ", "100: "};
		for(Student k: v) {
			a[(int)Math.round((int)(k.getGrade() / 10))] += "*";
		}
		
		for(int i = 0; i < a.length; i++) {
			res += a[i];
			res += '\n';
		}
			
		return "Grades distribution:\n" + res;
	}
	public String displayGradeReport() {
		double sum = 0, min =Integer.MAX_VALUE , max = Integer.MIN_VALUE;
		Student bestStudent = new Student();
		Student worstStudent = new Student();
		for(Student k: v) {
			if(k.getGrade() < min) {
				min = k.getGrade();
				worstStudent = k;
			}
			if(k.getGrade() > max) {
				max = k.getGrade();
				bestStudent = k;
			}
			sum += k.getGrade();
		}
		return "\nClass average is " + (sum / v.size()) + ". Lowest grade is "
		+ worstStudent + "Highest grade is " + bestStudent + "\n";
	}
	
	public String toString() {
		return this.displayGradeReport() + this.displayGradesDistribution();
	}
}
