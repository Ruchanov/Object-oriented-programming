package problem5;

import java.util.Comparator;



public class compName implements Comparator<Chocolate> {
	public int compare(Chocolate a, Chocolate b) {
		return a.name.compareTo(b.name);
	}
	
}
