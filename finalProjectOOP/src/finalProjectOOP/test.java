package finalProjectOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		String e_mail = reader.readLine();
		String password = reader.readLine();
		User now;
		for(User u : DataBase.users) {
			if(u.getpassword().equals(password) && u.getE_mail().equals(e_mail)) {
				System.out.println("Welcome, " + u.getName() + " " + u.getSurname());
				now = u;
			}
		}
	
		
	}

}
