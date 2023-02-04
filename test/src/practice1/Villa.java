package practice1;

public class Villa {
	String name;
	String country;
	String city;
	int price;
	int area;
	
	public String toString() {
		return this.name + " is located in " + this.country + "," + this.city + ". It's price is " + this.price + " and area is" + this.area; 
	}
	
}
