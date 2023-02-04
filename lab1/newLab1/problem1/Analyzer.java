package problem1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Data d = new Data();
		Scanner input = new Scanner(System.in);
		while(true) {
			String s = input.next();
			if(s.equals("Q")) {
				System.out.println(d.toString());
				break;
			}else {
				int x = Integer.parseInt(s);
				d.Add(x);
			}
		}
		input.close();
	}
	
}
