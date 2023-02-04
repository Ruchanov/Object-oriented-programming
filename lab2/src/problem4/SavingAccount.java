package problem4;

public class SavingAccount extends Account{
	int interestVariable;
	SavingAccount(int accNumber){
		super(accNumber);
		interestVariable = 14;
	}
	public void deposit(double sum) {
		//double balance = super.getBalance();
		double newBalance = sum * interestVariable/100;
		super.deposit(newBalance);
	}
}
