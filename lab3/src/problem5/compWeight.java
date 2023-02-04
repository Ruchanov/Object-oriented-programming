package problem5;

import java.util.Comparator;


public class compWeight implements Comparator<Chocolate> {
	public int compare(Chocolate a, Chocolate b) {
		return b.weight - a.weight;
	}
}
