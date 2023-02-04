package problem4;

public class Course {
	 private String courseID;
	 private String courseName;
	 private String prereq;
	 private int credits;
	 Course(){}
	 Course(String ID, String name){
		 this.courseID = ID;
		 this.courseName = name;
	 }
	 Course(String ID, String name, String prereq, int credits){
		 this.courseID = ID;
	  	 this.courseName = name;
	  	 this.prereq = prereq;
	  	 this.credits = credits;
	 }
	 public String toString() {
		 return this.courseID + ", " + this.courseName + ", " + this.prereq + ", ECTS" + this.credits;
	 }
}

