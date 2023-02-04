package problem5;

public class Series extends Circuit{
	Circuit c1,c2;
	Series(Circuit v,Circuit v2){
		c1 = v;
		c2 = v2;
	}
	private double pottentialDifference;
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}
	public double getPotentialDiff() {
		return super.getCurrent(pottentialDifference, this.getResistance()) * this.getResistance();
	}
	public void applyPotentialDiff(double d) {
		pottentialDifference = d;
	}
}
