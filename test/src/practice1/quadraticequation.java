package practice1;

import java.util.Scanner;

public class quadraticequation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input1.nextFloat();
		float c = input2.nextFloat();
		float D = b*b-4*a*c;
		if(D<0) {
			System.out.println("Error");
		}else if(D == 0) {
			System.out.println(-b/2*a);
		}else {
			float x = (-b + (float)Math.sqrt(D))/(2*a);
			float y = (-b - (float)Math.sqrt(D))/(2*a);
			System.out.println(x+","+y);
		}
	}
}
