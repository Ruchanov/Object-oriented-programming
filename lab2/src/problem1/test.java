package problem1;

import java.util.Vector;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> v = new Vector<Shape>();
		Shape s = new Sphere(2.3);
		Shape s2 = new Cylinder(2,2.3);
		v.add(s);
		v.add(s2);
		for(Shape shape : v) {
			System.out.println(shape.surfaceArea());
		}
	}
}
