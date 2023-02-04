package practice1;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		System.out.print("Area:");
		System.out.println(length * length);
		System.out.print("Perimeter:");
		System.out.println(length * 4);
		System.out.print("Dioganal:");
		System.out.println(Math.sqrt(Math.pow(length, 2)*2));
	}
}
