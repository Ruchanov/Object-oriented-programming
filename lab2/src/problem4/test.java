package problem4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Account a = new Account(1);
		Account b = new SavingAccount(2);
		Account c = new CheckingAccount(3);
		
		bank.add(a);
		bank.add(b);
		bank.add(c);
		bank.update();
		bank.delete(a);
		bank.printAllAcc();
	}

}
