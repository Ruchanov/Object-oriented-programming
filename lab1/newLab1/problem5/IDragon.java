package problem5;

public class IDragon extends Dragon{
	IDragon(){
		super();
	}
	@Override
	public void kidnap(Person p){
		if(p.age < 30) {
			super.kidnap(p);
			System.out.println("yes");
		}
	}
	public void printCoolnessLevel() {
		System.out.println("COOL");
	}
	Person p = new Person(Gender.Boy,19);
	public void willDragonEatOrNot() {
		if(p.age>18) {
			super.wiilDragonEatOrNot();
		}
	}
}
