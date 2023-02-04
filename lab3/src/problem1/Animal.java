package problem1;

public abstract class Animal {
	String name;
	int age;
	Animal(String a, int b){
		name = a;
		age = b;
	}
	public String toString() {
		return name + "'s age is " + age;
	}
	public abstract String voice(); 
}
