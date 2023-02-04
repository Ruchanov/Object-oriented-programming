package problem1;

public class Cylinder extends Shape{
	double h;
	double radius;
	final double pi = Math.PI;
	Cylinder(double radius,double h){	
		this.radius = radius;
		this.h = h;
	}
	public double volume() {
		return (pi * Math.pow(radius,2) * h);
	}
	public double surfaceArea() {
		return (pi * Math.pow(radius,2) * 2) + 2 * pi * radius * h;
	}
}
