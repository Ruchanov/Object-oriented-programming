package problem1;

public class Cube extends Shape{
	double length;
	Cube(double l){	
		this.length = l;
	}
	public double volume() {
		return  Math.pow(length,3);
	}
	public double surfaceArea() {
		return 6 * Math.pow(length,2);
	}
}
