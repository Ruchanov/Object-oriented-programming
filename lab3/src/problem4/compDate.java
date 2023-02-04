package problem4;

import java.util.Comparator;

public class compDate implements Comparator<Employee>{
	public int compare(Employee a, Employee b) {
		return a.date.compareTo(b.date);
	}
}
