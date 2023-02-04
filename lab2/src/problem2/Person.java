package problem2;

import java.util.Objects;

public class Person {
	String name;
	String surname;
	Person(String s, String n){
		name = s;
		surname = n;
	}
	public boolean equals(Object o) {
		if(o.getClass() != this.getClass()) return false;
		Person p = (Person) o;
		return this.name.equals(p.name) && this.surname.equals(p.surname); 
	}
	public int hashcode() {
		return Objects.hash(name,surname);
	}
	public String toString() {
		return this.name + " " + this.surname;
	}
}
