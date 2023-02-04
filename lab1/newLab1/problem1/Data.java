package problem1;

public class Data {
	private double average,maximum;
	private int size;
	char test;
	
	Data(){
		this.average = 0;
		this.maximum = Integer.MIN_VALUE;
		this.size = 0;
	}
	void Add(double d) {
		if(d > this.maximum) {
			this.maximum = d;
		}
		this.average = ((this.average * this.size) + d)/(size + 1);    
		this.size += 1;
	}
	public double getAverage() {
		return this.average;
	}
	public double getMax() {
		return this.maximum;
	}
	public char getTest() {
		return test;
	}
	public void setTest(char c){
		this.test = c;
	}
	public String toString() {
		return  " "+getAverage() +" " + getMax();
	}
}
