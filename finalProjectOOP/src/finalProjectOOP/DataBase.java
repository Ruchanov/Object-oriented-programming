package finalProjectOOP;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class DataBase {
	static HashSet<User> users = new HashSet<User>();
	static HashSet<News> news = new HashSet<News>(); 
	static HashMap<Book, Integer> libraryHavings = new HashMap<Book, Integer>();
	static HashMap<User, Vector<Book>> libraryGavings = new HashMap<User, Vector<Book>>();
	static HashSet<Teacher> teachers = new HashSet<Teacher>();
	static HashSet<Student> student = new HashSet<Student>();
}
