package problem5;

public class Resistor extends Circuit{
	double resistance;
	private double pottentialDifference;
	Resistor(double r){
		this.resistance = r;
	}
	public double getResistance() {
		return resistance;
	}
	public double getPotentialDiff() {
		return pottentialDifference;
	}
	public void applyPotentialDiff(double d) {
		pottentialDifference = d;
	}
	
}
