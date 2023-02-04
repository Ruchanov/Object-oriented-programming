package problem5;

import practice2.Time;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chocolate[] Array = new Chocolate[]{new Chocolate("twix",1),new Chocolate("mars",3),new Chocolate("albeni",2), new Chocolate("a",21)};
//		Chocolate[] Array = new Chocolate[4];
//		Array[0] = new Chocolate("twix",1);
//		Array[1] = new Chocolate("mars",3);
//		Array[2] = new Chocolate("albeni",2);
//		Array[3] = new Chocolate("a",23);
//		Sort.quickSort(Array, 0, Array.length - 1);
//		for (int i = 0; i < Array.length; i++)
//			System.out.println(Array[i]);
//		
		Time[] t = new Time[3];
		t[0] = new Time(21,21,12);
		t[1] = new Time(12,21,12);
		t[2] = new Time(9,21,12);
		Sort.quickSort(t, 0, t.length - 1);
		for (int i = 0; i < t.length; i++)
			System.out.println(t[i].toString());
		
	}

}
