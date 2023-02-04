package problem2;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Danial","Bidaibek");
		Person f = new FootballPlayer("Ernat","Manapaly","Kairat", 9);
		HashSet<Person> h = new HashSet<Person>();
		h.add(f);
		h.add(p);
	}

}  
