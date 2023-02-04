package problem1;

public class test {
	void moving(Animal a) {
		//Animal b = new Horse();
		a.move(7);
		//b.jump();
		
			((Horse) a).jump();
		
		
		
	}
	public static void main(String[] args) {
		Animal h = new Horse();
		//System.out.println(((Horse) h).voice("jnd"));
		System.out.println(h.voice("dsds"));
	}

}
