package practice1;

import java.util.Scanner;

public class balance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		float money = input.nextFloat();
		float percent = input2.nextFloat();
		System.out.print(money + percent * money/100);
	}
}
