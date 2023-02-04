package bonus;

import java.util.Vector;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> v= new Vector<Shape>();
		v.add(new Circle(Color.RED,4));
		//v.add(new Rectangle(Color.RED,4));
		for(Shape s : v) {
			s.draw();
		}
	}

}
