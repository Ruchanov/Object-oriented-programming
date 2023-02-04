package Pakita;

import java.io.IOException;

public class test {
	public static void main(String[] args) {
		try {
			(new ManagerDemo()).run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
