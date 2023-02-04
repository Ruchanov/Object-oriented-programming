package bonus;

public class Rectangle extends Shape{
	Rectangle(Color c,int p){
		super(c,p);
	}
	public void draw() {
		System.out.print(" ".repeat(pos));
		if(getColor()  == Color.BLACK) {
			System.out.println("[]");
		}
		if(getColor()  == Color.RED) {
			System.err.println("[]");
		}
	}
}
