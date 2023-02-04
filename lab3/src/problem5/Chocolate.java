package problem5;



import practice2.Time;

public class Chocolate implements Comparable<Chocolate>{
	int weight;
	String name;
	Chocolate(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return this.name + "'s weight is " + this.weight;
	}
	@Override
	public int compareTo(Chocolate o) {
		// TODO Auto-generated method stub
		if(this.weight > o.weight) return 1;
		if(this.weight < o.weight) return -1;
		return 0;
	}
	Time t = new Time(12,3,2);
	
	
}	
