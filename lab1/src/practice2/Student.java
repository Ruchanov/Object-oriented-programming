package practice2;

public class Student {
	private String name;
	private String id;
	private int year;
	private double grade;
	public Student(){};
	public Student(String name,String id, int year){
		this.name = name;
		this.id = id;
		this.year = year;
	}
	public String getName() {
		return this.name;
	}
	public double getGrade() {
		return this.grade;
	}
	public void setChange() {
		this.name = "dm";
	}
	public String getId() {
		return this.id;
	}
	public int getYear() {
		return this.year;
	}
	public void incrementYear() {
		this.year++;
	}
}
