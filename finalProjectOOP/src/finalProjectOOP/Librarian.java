package finalProjectOOP;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Librarian extends Employee{
	public Librarian(String e_mail, String password, String name, String surname, String id, Date d, Gender g, Status s,
			String national, String num, double salary, Date hireDate) {
		super(e_mail, password, name, surname, id, d, g, s, national, num, salary, hireDate);
		// TODO Auto-generated constructor stub
	}
	void deleteBook(Book b) {
		DataBase.libraryHavings.remove(b);
	}
	void giveBook(User u, Book b) {
		
		
	}
}
