package problem5;

public class Parallel extends Circuit{
	Circuit c1,c2;
	Parallel(Circuit v,Circuit v2){
		c1 = v;
		c2 = v2;
	}
	private double pottentialDifference;
	public double getResistance() {
		return c1.getResistance()*c2.getResistance()/(c1.getResistance()+c2.getResistance());
	}
	public double getPotentialDiff() {
		return c1.getPotentialDiff();
	}
	public void applyPotentialDiff(double d) {
		c1.applyPotentialDiff(d);
		c2.applyPotentialDiff(d);
	}
}
