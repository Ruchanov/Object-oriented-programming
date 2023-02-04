package problem2;

public class test {
	public static void main(String []args) {
		Car c  = new Car("nissan",Colour.Black);
		System.out.println(c.expenditure(7, 23));
		System.out.println(c.expenditure(5.5, 20));
	}
}
