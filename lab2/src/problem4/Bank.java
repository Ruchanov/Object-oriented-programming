package problem4;

import java.util.Vector;

public class Bank {
	double d;
	Bank(){}
	Vector<Account> v1 = new Vector<Account>();
	public void add(Account a) {
		v1.add(a);
	}
	public void update() {
		for(Account a : v1) {
			if(a instanceof SavingAccount) {
				a.deposit(23);
			}else if(a instanceof CheckingAccount) {
				((CheckingAccount) a).deductFee();
			}
		}
	}
	public void delete(Account a) {
		v1.remove(a);
	}
	public void printAllAcc() {
		for(Account a : v1) {
			System.out.println(a);
		}
	}
}


