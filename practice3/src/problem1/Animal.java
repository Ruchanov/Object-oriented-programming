package problem1;

public abstract class Animal {
	String name;
	int age;
	int x;
	Animal(){
		this.name = "without name";
		this.age = 0;
	}
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void move(int dx) {
		x+=dx;
	}
	public String voice(String s) {
		return s;
	}
	public char voice(char c) {
		return c;
	}
	public int distance(int v, int t) {
		return v * t;
	}
	public int distance(double v, double t) {
		return (int) (v*t);
	}
	
	public String toString() {
		return name + "'s age is:" + age;
	}
	
}
