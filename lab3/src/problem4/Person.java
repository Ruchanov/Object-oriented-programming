package problem4;

public class Person implements Cloneable{
	String name;
	public Person(String name){
		this.name = name;
	}
	public boolean equals(Object o) {
		if(o.getClass() != this.getClass()) return false;
		Person p = (Person) o;
		return this.name.equals(p.name); 
	}
	public String toString() {
		return "My name is " + this.name;
	}
	
}
