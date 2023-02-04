package bonus;

public abstract class Shape {
	private Color color;
	int pos;
	Shape(Color c,int p){
		color = c;
		pos = p;
	}
	public abstract void draw();
	public Color getColor() {
		return color;
	}
	public int getPos() {
		return pos;
	}
}
