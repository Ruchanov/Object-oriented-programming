package problem5;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double v);
	
	public double getPower(double v,double r) {
		return Math.pow(v, 2) / r;
	}
	public double getCurrent(double v,double r) {
		return v/r;
	}
}
