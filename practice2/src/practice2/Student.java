package practice2;

public class Student {
	public String name;
	public String id;
	public int year;
	Student(String name,String id, int year){
		this.name = name;
		this.id = id;
		this.year = year;
	}
	public String getName() {
		return this.name;
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
