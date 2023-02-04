package problem4;

import java.util.Comparator;

public class compName implements Comparator<Employee>{
	public int compare(Employee a, Employee b) {
		return a.name.compareTo(b.name);
	}
}
