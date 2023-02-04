package problem1;

public class Sphere extends Shape{
	double radius;
	final double pi = Math.PI;
	Sphere(double radius){	
		this.radius = radius;
	}
	public double volume() {
		return 3/4 * pi * Math.pow(radius,3) ;
	}
	public double surfaceArea() {
		return 4 * pi * Math.pow(radius,2);
	}
}
