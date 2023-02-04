package problem1;

public class Bird extends Animal implements SingSong, CanEatEverything{
	Bird(String s, int n){
		super(s,n);
	}

	@Override
	public String voice() {
		return "chick-chirick";
	}

	@Override
	public void song(String s) {
		System.out.println("chick-chirick chick-chirick chick-chirick");
	}
	@Override
	public boolean eatEverything() {
		return true;
	}
	
}
