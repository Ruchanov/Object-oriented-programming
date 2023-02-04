package problem2;

public class Car {
	final String model;
	static Colour col;
	
	Car(String m,Colour col){
		this.model = m;
		this.col = col;
	}
	double expenditure(int fuel, int dist) {
		return (double)fuel/dist*100;
	}
	double expenditure(double fuel, double dist) {
		return fuel/dist*100;
	}
}
