package bonus;

public class Circle extends Shape{
	Circle(Color c,int p){
		super(c,p);
	}
	public void draw() {
		System.out.print(" ".repeat(pos));
		if(super.getColor()  == Color.BLACK) {
			System.out.println("()");
		}
		if(super.getColor()  == Color.RED) {
			System.err.println("()");
		}
	}
	
}