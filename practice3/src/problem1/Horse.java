package problem1;

public class Horse extends Animal{
	private String name;
	private int age;
	private String breed;
	Horse(){
		super();
		breed = "default";
	}
	Horse(String name,int age,String breed){
		super(name,age);
		this.breed = breed;
	}
	public String toString() {
		//return name + "'s age is " + age + ",and breed is " + breed;
		return super.toString() + ",and breed is " + breed;
 	}
	public void jump() {
		System.out.println("jump");
	}
	
	@Override
	public String voice(String s) {
		return "the horses voice is" +super.voice(s);
	}
	
	@Override
	public int distance(double v, double t) {
		return super.distance(v, t);
	}
	
	@Override
	public int distance(int v, int t) {
		return super.distance(v, t);
	}
}
