package practice1;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		String[] ar = {"F","F","F","F","F","F","F","F","F","F","D","D+","C-","C","C+","B-","B","B+","A-","A"};
		System.out.println(ar[(int)(Math.round(grade/5))]);
	}
}
