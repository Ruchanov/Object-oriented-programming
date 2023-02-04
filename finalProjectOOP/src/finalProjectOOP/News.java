package finalProjectOOP;

import java.util.Date;
import java.util.Vector;

public class News {
	Date date;
	String title;
	Vector<String> comment = new Vector<String>();
	String content;
	News(Date d, String t, String c){
		this.content = c;
		this.date = d;
		this.title = t;
	}
	News(String t, String c){
		this.content = c;
		this.date = new Date();
		this.title = t;
	}
	public String toString() {
		return date + "/n" + title + "/n" + content + "/n" + comment;
	}
	
}
